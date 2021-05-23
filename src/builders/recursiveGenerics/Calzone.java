package builders.recursiveGenerics;

public class Calzone extends Pizza {

    private final boolean sauceInside;

    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }


    public static class Builder extends Pizza.Builder<Builder> {

        private boolean sauceInside = false; // default

        public Builder sauceInside() {
            sauceInside = true;
            return self();
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    @Override
    public String toString() {
        return "Calzone{" +
                "sauceInside=" + sauceInside +
                ", toppings=" + toppings +
                '}';
    }
}
