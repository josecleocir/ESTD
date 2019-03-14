
package dados;

public class Dado {
    int lado;

    public Dado(int lado) {
        this.lado=lado;
    }

    public int jogarDado(int modificador) {
        return (int) (((Math.random()*lado)+1)+modificador);
    }
}
