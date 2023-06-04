package runners;


import net.thucydides.core.model.DataTable;
import net.thucydides.core.model.Story;
import net.thucydides.core.model.TestOutcome;
import net.thucydides.core.screenshots.ScreenshotAndHtmlSource;
import net.thucydides.core.steps.ExecutedStepDescription;
import net.thucydides.core.steps.StepFailure;
import net.thucydides.core.steps.StepListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

public class ListenerHook implements StepListener {
    private static final Logger logger = LogManager.getLogger(ListenerHook.class);

    @Override
    public void testSuiteStarted(Class<?> aClass) {
        logger.info("testSuiteStarted");
    }

    @Override
    public void testSuiteStarted(Story story) {
        logger.info("testSuiteStarted");
    }

    @Override
    public void testSuiteFinished() {
        logger.info("testSuiteFinished");
    }

    @Override
    public void testStarted(String s) {
        logger.info(s);
    }

    @Override
    public void testStarted(String s, String s1) {
        logger.info("testSuiteStarted");
    }

    @Override
    public void testStarted(String s, String s1, ZonedDateTime zonedDateTime) {
        logger.info("testSuiteStarted");
    }

    @Override
    public void testFinished(TestOutcome testOutcome) {
        logger.info("testSuiteStarted");
    }

    @Override
    public void testFinished(TestOutcome testOutcome, boolean b, ZonedDateTime zonedDateTime) {
        logger.info("testSuiteStarted");
    }

    @Override
    public void testRetried() {
        logger.info("testSuiteStarted");
    }

    @Override
    public void stepStarted(ExecutedStepDescription executedStepDescription) {
        logger.info("testSuiteStarted");
    }

    @Override
    public void skippedStepStarted(ExecutedStepDescription executedStepDescription) {
        logger.info("testSuiteStarted");
    }

    @Override
    public void stepFailed(StepFailure stepFailure) {

    }

    @Override
    public void lastStepFailed(StepFailure stepFailure) {
        logger.info("testSuiteStarted");
    }

    @Override
    public void stepIgnored() {
        logger.info("testSuiteStarted");
    }

    @Override
    public void stepPending() {

    }

    @Override
    public void stepPending(String s) {

    }

    @Override
    public void stepFinished() {
        logger.info("stepFinished");
    }

    @Override
    public void stepFinished(List<ScreenshotAndHtmlSource> list) {

    }

    @Override
    public void testFailed(TestOutcome testOutcome, Throwable throwable) {

    }

    @Override
    public void testIgnored() {

    }

    @Override
    public void testSkipped() {

    }

    @Override
    public void testPending() {

    }

    @Override
    public void testIsManual() {

    }

    @Override
    public void notifyScreenChange() {

    }

    @Override
    public void useExamplesFrom(DataTable dataTable) {

    }

    @Override
    public void addNewExamplesFrom(DataTable dataTable) {

    }

    @Override
    public void exampleStarted(Map<String, String> map) {

    }

    @Override
    public void exampleFinished() {

    }

    @Override
    public void assumptionViolated(String s) {

    }

    @Override
    public void testRunFinished() {
        logger.info("testRunFinished");
    }

    @Override
    public void takeScreenshots(List<ScreenshotAndHtmlSource> list) {

    }
}
