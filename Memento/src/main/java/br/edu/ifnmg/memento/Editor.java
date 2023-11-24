
package br.edu.ifnmg.memento;

import java.util.ArrayList;
import java.util.List;
import br.edu.ifnmg.memento.EditorMemento;


class Editor {
    private String texto;
    private int cursorPosition;
    private List<EditorMemento> mementos = new ArrayList<>();

    public Editor() {
        this.texto = "";
        this.cursorPosition = 0;
    }

    public void digitarTexto(String texto) {
        this.texto += texto;
        salvarEstado();
    }

    public void moverCursor(int passos) {
        this.cursorPosition += passos;
        salvarEstado();
    }

    public void desfazer() {
        if (!mementos.isEmpty()) {
            EditorMemento ultimoMemento = mementos.remove(mementos.size() - 1);
            this.texto = ultimoMemento.getTexto();
            this.cursorPosition = ultimoMemento.getCursorPosition();
        }
    }

    private void salvarEstado() {
        EditorMemento memento = new EditorMemento(texto, cursorPosition);
        mementos.add(memento);
    }

    public void exibirEstado() {
        System.out.println("Texto: " + texto);
        System.out.println("Posição do Cursor: " + cursorPosition);
        System.out.println("-----------");
    }

    
}
