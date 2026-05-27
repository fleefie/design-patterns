package fr.fleefie.designpatterns.singleton;

/**
 * Classe représentant un singleton de type {@code Integer}, créé dès que
 * possible.
 */
public class IntegerSingletonEager {
    /**
     * L'instance unique statique stockée, initialisée dès que possible.
     */
    private static final IntegerSingletonEager instance = new IntegerSingletonEager();

    /**
     * Les données de l'instance.
     */
    private Integer value;

    /**
     * Constructeur privé pour forcer l'utilisation de la méthode statique.
     * Cela nous permet de garantir que l'instance unique est renvoyée.
     */
    private IntegerSingletonEager() {
        this.value = 0;
    }

    /**
     * Méthode pour obtenir l'instance stockée dans le singleton.
     *
     * @return l'instance
     */
    public static IntegerSingletonEager getInstance() {
        return instance;
    }

    /**
     * Getter pour les données du singleton.
     *
     * @return La valeur stockée.
     */
    public Integer getValue() {
        return this.value;
    }

    /**
     * Setter pour les données du singleton.
     *
     * @param v Nouvelle valeur.
     */
    public void setValue(Integer v) {
        this.value = v;
    }
}
