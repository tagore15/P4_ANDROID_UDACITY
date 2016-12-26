package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by jmd on 12/26/2016.
 */

@RunWith(AndroidJUnit4.class)
@SmallTest
public class jokeTaskTest {

    @Test
    public void jokeTaskTest() throws TimeoutException, InterruptedException, ExecutionException {
        jokeTask mJokeTask = (jokeTask) new jokeTask() {
            @Override
            protected void onPostExecute(String result)
            {
                String expectedJoke = "This is totally a funny joke";
                assertNotNull(result);
                assertEquals(result, expectedJoke);
            }
        };
        mJokeTask.execute(InstrumentationRegistry.getTargetContext());
    }
}
