package id.ac.polinema.idealbodyweight.util;

public class BodyMassIndex {
    private int weight;
    private float height;
    private String index;

    public BodyMassIndex(int weight, float height) {
        this.weight = weight;
        this.height = height;
        this.index = calculate();
    }

    public String getIndex() {

        return index;
    }

    private String calculate() {

        float hasil = (weight / (height * height));

        if (hasil < 18.5) {
            return "Kurus";
        }
        else if (hasil > 18.5 && hasil < 25) {
            return "Normal";
        }
        else if (hasil > 25) {
            return "Gemuk";
        }
        return "Error";
    }
}
