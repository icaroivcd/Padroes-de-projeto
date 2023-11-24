

package br.edu.ifnmg.memento;
import br.edu.ifnmg.memento.Editor;

class Usuario {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.digitarTexto("Olá, ");
        editor.exibirEstado();

        editor.digitarTexto("Mundo!");
        editor.exibirEstado();

        editor.moverCursor(2);
        editor.exibirEstado();

        editor.desfazer();
        editor.exibirEstado();
    }
}
