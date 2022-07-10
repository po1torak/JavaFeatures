package lombok;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private String name;
    private String brand;
    private int price;

}
