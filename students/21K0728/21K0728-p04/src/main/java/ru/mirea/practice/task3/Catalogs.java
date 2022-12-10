package ru.mirea.practice.task3;

public enum Catalogs {
    MEAT() {
        final Products[] products = {new Products("Pork", 389),
                                     new Products("Fish", 159),
                                     new Products("Chicken", 299)};

        @Override
        public void getDescription() {
            for (Products product : products) {
                System.out.print(product);
            }
        }

        @Override
        public Products[] getProducts() {
            return products;
        }
    },
    DRINKS() {
        final Products[] products = {new Products("Sprite", 89),
                                     new Products("Lean", 7999),
                                     new Products("Red Bull", 199)};

        @Override
        public void getDescription() {
            for (Products product : products) {
                System.out.print(product);
            }
        }

        @Override
        public Products[] getProducts() {
            return products;
        }
    },
    VEGETABLES() {
        final Products[] products = {new Products("Potato", 35),
                                     new Products("Tomatoes", 56),
                                     new Products("Carrot", 70)};

        @Override
        public void getDescription() {
            for (Products product : products) {
                System.out.print(product);
            }
        }

        @Override
        public Products[] getProducts() {
            return products;
        }
    };

    private Products[] products;

    public void getDescription() {
        System.out.print(" ");
    }

    public Products[] getProducts() {
        return products;
    }


    @Override
    public String toString() {
        getDescription();
        return "";
    }
}
