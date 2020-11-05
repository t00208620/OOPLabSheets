package labsheet7.exercise1;

//Product.java
/*A simple instantiable class definition for a Product*/

public class Product {
        private int id;
        private String name;
        private String description;
        private static int count=100001;

        public Product(int id, String name, String description) {
            setId(count);
            setName(name);
            setDescription(description);
            incrementCount();
        }

    private static void incrementCount() {
            count=count+1;
    }

    public static int count(){
            return count;
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

        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }

        public String toString() {
            return "Product details are as follows: id: " + id + "  name: " + name + "  description: " + description;
        }
}

