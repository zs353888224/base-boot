package cn.wscq.name.domain.model.enums;

/**
 * @author shuai
 * @version 1.0
 * @description
 * @date 2017/12/11 17:53
 */
public enum AppMenu implements BaseEnum<String> {
    DEFAULT("默认", 0, "/product");

    private String label;
    private int value;
    private String url;

    private AppMenu(String label, int value, String url) {
        this.label = label;
        this.value = value;
        this.url = url;
    }

    public static AppMenu valueOf(Integer value) {
        AppMenu[] enums = values();
        for (AppMenu menu : enums) {
            if (menu.value == value) {
                return menu;
            }
        }
        throw new IllegalArgumentException("Illegal value");
    }

    @Override
    public int getEnumValue() {
        return this.value;
    }
}
