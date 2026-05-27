package fr.fleefie.designpatterns.singleton;

/**
 * Classe représentant un singleton de type {@code Integer}, créé que lorsque
 * nécéssaire.
 */
public class IntegerSingletonLazy {
    /**
     * L'instance unique statique stockée, initialisée plus tard.
     */
    private static IntegerSingletonLazy instance = null;

    /**
     * Les données de l'instance.
     */
    private Integer value;

    /**
     * Constructeur privé pour forcer l'utilisation de la méthode statique.
     * Cela nous permet de garantir que l'instance unique est renvoyée.
     */
    private IntegerSingletonLazy() {
        this.value = 0;
    }

    /**
     * Méthode pour obtenir l'instance stockée dans le singleton.
     * Elle est créée ici si nécéssaire.
     *
     * @return l'instance
     */
    public static IntegerSingletonLazy getInstance() {
        // Dans un code multi-threadé, il faudrait mettre un lock sur 
        // instance ici !
        if (instance == null)
            instance = new IntegerSingletonLazy();
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
