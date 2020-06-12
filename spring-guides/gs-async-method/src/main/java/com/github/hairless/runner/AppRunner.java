package com.github.hairless.runner;

import com.github.hairless.pojo.User;
import com.github.hairless.service.GitHubLookupService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import org.springframework.boot.CommandLineRunner;

import java.util.concurrent.CompletableFuture;

/**
 * @author wangyangting
 * @date 2020-06-12
 */
@RequiredArgsConstructor
@Slf4j
@Component
public class AppRunner implements CommandLineRunner {

    private final GitHubLookupService gitHubLookupService;

    @Override
    public void run(String... args) throws Exception {
        // Start the clock
        long start = System.currentTimeMillis();

        // Kick of multiple, asynchronous lookups
        CompletableFuture<User> page1 = gitHubLookupService.findUser("hairless");
        CompletableFuture<User> page2 = gitHubLookupService.findUser("hairless");
        CompletableFuture<User> page3 = gitHubLookupService.findUser("wangyangting");

        // Wait until they are all done
        CompletableFuture.allOf(page1,page2,page3).join();

        // Print results, including elapsed time
        log.info("Elapsed time: " + (System.currentTimeMillis() - start));
        log.info("--> " + page1.get());
        log.info("--> " + page2.get());
        log.info("--> " + page3.get());
    }
}
