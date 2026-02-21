@RestController
@RequestMapping("/api")
public class JobController {

    @GetMapping("/hello")
    public String hello() {
        return "LabourDekho API is running! 🚀";
    }
}