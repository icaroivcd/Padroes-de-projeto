
package br.edu.ifnmg.memento;


class EditorMemento {
    private String texto;
    private int cursorPosition;

    public EditorMemento(String texto, int cursorPosition) {
        this.texto = texto;
        this.cursorPosition = cursorPosition;
    }

    public String getTexto() {
        return texto;
    }

    public int getCursorPosition() {
        return cursorPosition;
    }
}
