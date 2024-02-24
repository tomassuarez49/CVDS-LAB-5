mport org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class GuessController {

    private int prize = 100000;

    @GetMapping("/guess")
    public String guessForm() {
        return "guess";
    }

    @PostMapping("/guess")
    public String guessNumber(@RequestParam int number, Model model) {
        Random random = new Random();
        int correctNumber = random.nextInt(10) + 1;
        int attempts = 1;

        while (number != correctNumber) {
            prize -= 10000;
            attempts++;
            correctNumber = random.nextInt(10) + 1;
        }

        model.addAttribute("prize", prize);
        model.addAttribute("attempts", attempts);

       
        prize = 100000;

        return "result";
    }
}