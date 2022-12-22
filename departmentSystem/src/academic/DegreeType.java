package academic;

// DegreeType enum contains types of graduate student types
public enum DegreeType {
    // Degree types defined by us
    MASTER {
        @Override
        public String toString() {
            return "MASTER";
        }
    },
    DOCTORAL {
        public String toString() {
            return "DOCTORAL";
        }
    }
}
