package academic;

public enum DegreeType {
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
