package com.turkcell.ecommerce_cqrs.domain.category.model;

public class Category {
    private final CategoryId id;
    private String name;

    public Category(CategoryId id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Category create(String name)
    {
        validateName(name);

        return  new Category(CategoryId.generate(),name);
    }

    public static Category rehydrate(CategoryId id, String name)
    {
        return new Category(id, name);
    }

    public void renameCategory(String name){
        validateName(name);
        this.name = name;
    }

    private static void validateName(String name)
    {
        if(name == null || name.isEmpty())
            throw new IllegalArgumentException("Name cannot be null or empty");
        if(name.length() >= 255)
            throw new IllegalArgumentException("Name length must be less than 255 characters ");
    }

    public CategoryId id() {
        return id;
    }

    public String name() {
        return name;
    }
}
