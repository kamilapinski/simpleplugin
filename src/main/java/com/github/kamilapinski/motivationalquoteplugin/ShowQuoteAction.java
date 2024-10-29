package com.github.kamilapinski.motivationalquoteplugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ShowQuoteAction extends AnAction {

    private final List<String> quotes = Arrays.asList(
            "You are stronger than you think.",
            "Every day is a second chance.",
            "Success is not final, failure is not fatal: It is the courage to continue that counts.",
            "Your limitation—it’s only your imagination.",
            "Push yourself, because no one else is going to do it for you."
    );

    @Override
    public void actionPerformed(AnActionEvent event) {
        String randomQuote = quotes.get(new Random().nextInt(quotes.size()));
        Messages.showMessageDialog(
                randomQuote,
                "Motivational Quote",
                Messages.getInformationIcon()
        );
    }
}
