package ru.unn.agile.dijkstraalgorithm.viewmodel;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import ru.unn.agile.dijkstraalgorithm.model.DijkstraGraph;

public class EdgeViewModel {
    private final SimpleStringProperty vertex1 = new SimpleStringProperty("");
    private final SimpleStringProperty vertex2 = new SimpleStringProperty("");
    private final SimpleIntegerProperty weight = new SimpleIntegerProperty();

    private final DijkstraGraph.Edge edge;

    public EdgeViewModel() {
        this("", "", "");
    }

    EdgeViewModel(String vertex1, String vertex2, String weight) {
        setVertex1(vertex1);
        setVertex2(vertex2);
        setWeight(weight);

        edge = new DijkstraGraph.Edge(this.vertex1.toString(), this.vertex2.toString(), Integer.parseInt(weight));
    }

    public SimpleStringProperty vertex1Property() {
        return vertex1;
    }

    private void setVertex1(String vertex1) {
        this.vertex1.set(vertex1);
    }

    public SimpleStringProperty vertex2Property() {
        return vertex2;
    }

    private void setVertex2(String vertex2) {
        this.vertex2.set(vertex2);
    }

    public SimpleIntegerProperty weightProperty() {
        return weight;
    }

    private void setWeight(String weight) {
        this.weight.set(Integer.parseInt(weight));
    }

    DijkstraGraph.Edge getEdge() {
        return edge;
    }
}
