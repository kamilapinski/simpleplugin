package com.github.kamilapinski.motivationalquoteplugin;

import com.intellij.ide.AppLifecycleListener;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.ui.Messages;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class QuoteAppComponent implements AppLifecycleListener {

    private final List<String> quotes = Arrays.asList(
            "Believe in yourself! You can become a crucial part of AI's success today!",
            "You are capable of amazing things. Because AI is not that smart yet. It is only ABLE to tell you 'CAPs off'",
            "Don't watch the clock; do what it does. Keep going. Like AI does.",
            "Dream it. Wish it. Do it. Swim against the tide like our intern's ship.",
            "Stay positive, work hard, make it happen. Just like our new intern ;P",
            "Do you know what's the difference between programmers and an AI? Programmers procrastinate too often. Be better ;)"
    );

    @Override
    public void appStarted() {
        showRandomQuote();
    }

    private void showRandomQuote() {
        String randomQuote = quotes.get(new Random().nextInt(quotes.size()));
        ApplicationManager.getApplication().invokeLater(() ->
                Messages.showMessageDialog(
                        randomQuote,
                        "Motivational Quote of the Day",
                        Messages.getInformationIcon()
                )
        );
    }
}
