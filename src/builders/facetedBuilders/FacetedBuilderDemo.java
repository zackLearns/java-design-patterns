package builders.facetedBuilders;

public class FacetedBuilderDemo {

    public static void main(String[] args) {

        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder
                .lives()
                    .at("123 Serangoon Road")
                    .in("Singapore")
                    .withPostCode("POS456")
                .works()
                    .at("ZackCom")
                    .asA("Software Engineer")
                    .earning(9500000)
                .build();

        System.out.println(person);
    }
}
