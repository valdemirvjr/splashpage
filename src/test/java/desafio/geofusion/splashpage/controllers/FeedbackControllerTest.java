package desafio.geofusion.splashpage.controllers;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import desafio.geofusion.splashpage.entities.Question;
import desafio.geofusion.splashpage.services.FeedbackService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:dispatcher-servlet.xml"})
@WebAppConfiguration
public class FeedbackControllerTest
{
    private MockMvc mockMvc;

//    @Autowired
    @Mock
    private FeedbackService feedbackServiceMock;

//    @InjectMocks
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);
        Mockito.reset(feedbackServiceMock);

        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void shouldAddFeedbackQuestionToModelAndRenderFeedbackView() throws Exception
    {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question());

        when(feedbackServiceMock.readAllFeedbackQuestions()).thenReturn(questions);

        mockMvc.perform(get("/feedback"))
                .andExpect(status().isOk())
                .andExpect(view().name("feedback"))
                .andExpect(forwardedUrl("/pages/feedback.jsp"))
                .andExpect(model().attribute("feedbackQuestions", hasSize(4)));

        verify(feedbackServiceMock, times(1)).readAllFeedbackQuestions();
        verifyNoMoreInteractions(feedbackServiceMock);
    }
}
