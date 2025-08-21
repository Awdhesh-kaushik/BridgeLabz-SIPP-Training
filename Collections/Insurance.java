import java.util.*;
import java.time.*;

class Policy {
    String policyNumber;
    String policyHolder;
    LocalDate expiryDate;

    public Policy(String policyNumber, String policyHolder, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyHolder + " | " + expiryDate;
    }
}

public class InsuranceSystem {
    // HashMap for quick access
    private Map<String, Policy> policyMap = new HashMap<>();
    // LinkedHashMap for maintaining insertion order
    private Map<String, Policy> orderedPolicies = new LinkedHashMap<>();
    // TreeMap for sorting by expiry date
    private TreeMap<LocalDate, Policy> policiesByExpiry = new TreeMap<>();

    // Add policy
    public void addPolicy(Policy p) {
        policyMap.put(p.policyNumber, p);
        orderedPolicies.put(p.policyNumber, p);
        policiesByExpiry.put(p.expiryDate, p);
    }

    // Retrieve by policy number
    public Policy getPolicy(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // Policies expiring in next 30 days
    public List<Policy> expiringSoon() {
        List<Policy> result = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);
        for (Map.Entry<LocalDate, Policy> entry : policiesByExpiry.entrySet()) {
            if (!entry.getKey().isAfter(limit)) {
                result.add(entry.getValue());
            }
        }
        return result;
    }

    // Policies of a holder
    public List<Policy> getPoliciesByHolder(String holder) {
        List<Policy> result = new ArrayList<>();
        for (Policy p : orderedPolicies.values()) {
            if (p.policyHolder.equalsIgnoreCase(holder)) {
                result.add(p);
            }
        }
        return result;
    }

    // Remove expired policies
    public void removeExpired() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<String, Policy>> it = policyMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Policy> entry = it.next();
            if (entry.getValue().expiryDate.isBefore(today)) {
                it.remove();
                orderedPolicies.remove(entry.getKey());
                policiesByExpiry.remove(entry.getValue().expiryDate);
            }
        }
    }

    public static void main(String[] args) {
        InsuranceSystem sys = new InsuranceSystem();
        sys.addPolicy(new Policy("P101", "Alice", LocalDate.now().plusDays(10)));
        sys.addPolicy(new Policy("P102", "Bob", LocalDate.now().plusDays(40)));
        sys.addPolicy(new Policy("P103", "Alice", LocalDate.now().minusDays(5)));

        System.out.println("Retrieve P101: " + sys.getPolicy("P101"));
        System.out.println("Expiring Soon: " + sys.expiringSoon());
        System.out.println("Alice Policies: " + sys.getPoliciesByHolder("Alice"));

        sys.removeExpired();
        System.out.println("After removing expired: " + sys.policyMap.values());
    }
}
