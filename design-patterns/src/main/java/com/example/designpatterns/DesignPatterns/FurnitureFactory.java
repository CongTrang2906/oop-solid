package com.example.designpatterns.DesignPatterns;

//Super Factory Class
public class FurnitureFactory {
    private FurnitureFactory() {
    }
    public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
        switch (materialType) {
            case FLASTIC:
                return new FlasticFactory();
            case WOOD:
                return new WoodFactory();
            default:
                throw new UnsupportedOperationException("This furniture is unsupported ");
        }
    }
}
