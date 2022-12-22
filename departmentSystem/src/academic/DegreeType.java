package academic;

// DegreeType enum contains types of graduate student types
public enum DegreeType {
    // Degree types defined by us
    MASTER { // Master degree type
        @Override
        public String toString() {
            return "MASTER";
        }
    },
    DOCTORAL { // Doctoral degree type
        public String toString() {
            return "DOCTORAL";
        }
    }
}
