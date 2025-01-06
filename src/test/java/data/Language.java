package data;

import lombok.Getter;

@Getter
public enum Language {
    RU("Русский", "RU"),
    DE("Deutsch", "DE");
    private final String name;
    private final String code;

    Language(String name, String code) {
        this.name = name;
        this.code = code;
    }
}