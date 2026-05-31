package fr.fleefie.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe réprésentant un noeud de l'arbre de composition.
 */
public class Composite extends Component {
    /**
     * Lise des composants fils.
     */
    private List<Component> children = new ArrayList<Component>();

    /**
     * Méthode d'exécution.
     * Voir patterne iterator pour une version où l'ordre importe.
     */
    @Override
    public void doStuff() {
        System.out.println("[Composite][Composite] J'exécute mon code...");
        // Délégation par aggrégation
        for (Component child : children)
            child.doStuff();
    }

    // Méthodes de gestion des fils.

    /**
     * Ajouter un fils.
     *
     * @param child le fils à ajouter.
     * @return this
     */
    public Composite addChild(Component child) {
        children.add(child);
        return this;
    }

    /**
     * Retirer un fils.
     *
     * @param child le fils à retirer.
     * @return this
     */
    public Composite removeChild(Component child) {
        children.remove(child);
        return this;
    }

    /**
     * Obtenir un fils.
     *
     * @param id l'identifiant.
     * @return le fils.
     */
    public Component getChild(int id) {
        return children.get(id);
    }
}
