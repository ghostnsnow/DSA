package designpatterns.creational;

public class BuilderPatternExample {

    private String firstNm;
    private String lastNm;
    private int age;

    public BuilderPatternExample(String firstNm, String lastNm, int age) {
        this.firstNm = firstNm;
        this.lastNm = lastNm;
        this.age = age;
    }

    public static BuilderPatternExampleBuilder builder() {

        return new BuilderPatternExampleBuilder();
    }
    private static class BuilderPatternExampleBuilder {

        private String firstNm;
        private String lastNm;
        private int age;

        public BuilderPatternExampleBuilder firstNm(String firstNm) {

            this.firstNm = firstNm;
            return this;
        }

        public BuilderPatternExampleBuilder lastNm(String lastNm) {

            this.lastNm = lastNm;
            return this;
        }

        public BuilderPatternExampleBuilder age(int age) {

            this.age = age;
            return this;
        }

        public BuilderPatternExample build() {

            return new BuilderPatternExample(firstNm, lastNm, age);
        }
    }

    public static void main(String[] args) {

        BuilderPatternExample example = BuilderPatternExample.builder().firstNm("Chintanu").lastNm("Pallai").age(34).build();

        System.out.println(example.firstNm + " " + example.lastNm + " : " + example.age);
    }
}
