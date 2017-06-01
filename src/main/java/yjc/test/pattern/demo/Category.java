package yjc.test.pattern.demo;

/**
 * 电子券类型
 * Created by yangjiachang on 2016/4/22.
 */
public enum Category {

    GENERAL(1,"凭证券"),
    CASH(2,"代金券");

    private Integer id;
    private String value;

    Category(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public static Category valueOf(Integer id) {
        for (Category category : Category.values()) {
            if (category.getId().equals(id)) {
                return category;
            }
        }
        return null;
    }

    public static String getValue(Integer id) {
        for (Category category : Category.values()) {
            if (category.getId().equals(id)) {
                return category.getValue();
            }
        }
        return null;
    }

    public Integer getId() {
        return id;
    }

    public String getValue() {
        return value;
    }



}
