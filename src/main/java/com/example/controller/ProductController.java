@RestController
public class ProductController {

    @GetMapping("/products")
    public ArrayList<Product> getAllProducts(){
        return  new ArrayList<>();
    }
}