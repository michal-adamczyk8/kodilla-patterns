package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private final boolean roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    private BigMac(boolean roll, int burgers, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public boolean isRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "roll=" + roll +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigMacBuilder {
        private boolean roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();


        public BigMacBuilder roll(boolean roll) {
            this.roll = roll;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            if(sauce.equals("standard") || sauce.equals("1000 wysp") || sauce.equals("barbecue")) {
                this.sauce = sauce;
                return this;
            }
            else {
                throw new IllegalStateException("Wybranego sosu, nie ma w menu, proszę wybrać inny sos.");
            }
        }

        public BigMacBuilder ingredients(String ingredient) {
            if (ingredient.equals("sałata") || ingredient.equals("cebula") || ingredient.equals("bekon")
                    || ingredient.equals("ogórek") || ingredient.equals("papryczki") || ingredient.equals("chilli")
                    || ingredient.equals("pieczarki") || ingredient.equals("krewetki") || ingredient.equals("ser")) {
                ingredients.add(ingredient);
                return this;
            }
            else {
                throw new IllegalStateException("Wybranego składnika nie ma w menu, proszę wynrać inny składnik.");
            }
        }

        public BigMac build() {
            return new BigMac(roll, burgers, sauce, ingredients);
        }
    }
}
