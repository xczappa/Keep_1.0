package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.model.Tweet;
import pl.coderslab.model.User;
import pl.coderslab.repository.TweetRepository;
import pl.coderslab.repository.UserRepository;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/tweet")
public class TweetController {

    @Autowired
    private TweetRepository tweetRepository;

    @Autowired
    private UserRepository userRepository;


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showTweetForm(Model model) {
        model.addAttribute("tweet", new Tweet());
        return "form/tweetForm";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addTweet(@Valid Tweet tweet, BindingResult result) {
        if (result.hasErrors()) {
            return "form/tweetForm";
        } else if (tweet.getId() != null) {
            tweetRepository.save(tweet);
        } else {
            tweet.setCreated(LocalDate.now());
            tweetRepository.save(tweet);
        }
        return "redirect:all";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String allTweets(Model model) {
        model.addAttribute("tweets", tweetRepository.findAll());
        return "tweetList";
    }

    @ModelAttribute("users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }



}
