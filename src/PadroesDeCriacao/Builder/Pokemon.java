package PadroesDeCriacao.Builder;

public class Pokemon {

    private String name;
    private Integer life;
    private Double height;
    private Double weight;
    private Integer id;
    private Integer classification;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getLife() {
        return life;
    }
    public void setLife(Integer life) {
        this.life = life;
    }
    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getClassification() {
        return classification;
    }
    public void setClassification(Integer classification) {
        this.classification = classification;
    }
    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", height=" + height +
                ", weight=" + weight +
                ", id=" + id +
                ", classification=" + classification +
                '}';
    }
}
