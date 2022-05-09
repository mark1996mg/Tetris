module com.example.tetris {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.game.tetris to javafx.fxml;
    exports com.game.tetris;
}