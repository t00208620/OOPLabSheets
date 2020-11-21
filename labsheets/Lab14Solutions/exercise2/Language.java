package Lab14Solutions.exercise2;

//Language.java
/*A simple instantiable class that defines a language*/

public class Language {

        private int id;
        private String name;

        public Language() {
        }

        public Language(int id, String name) {
            setId(id);
            setName(name);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String toString() {
            return "Language ID: " + getId() + "  Language Name: " + getName();
        }
}
