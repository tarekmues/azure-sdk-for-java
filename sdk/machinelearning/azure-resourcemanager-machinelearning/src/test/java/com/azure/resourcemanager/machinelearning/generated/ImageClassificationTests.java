// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ClassificationPrimaryMetrics;
import com.azure.resourcemanager.machinelearning.models.EarlyTerminationPolicy;
import com.azure.resourcemanager.machinelearning.models.ImageClassification;
import com.azure.resourcemanager.machinelearning.models.ImageLimitSettings;
import com.azure.resourcemanager.machinelearning.models.ImageModelDistributionSettingsClassification;
import com.azure.resourcemanager.machinelearning.models.ImageModelSettingsClassification;
import com.azure.resourcemanager.machinelearning.models.ImageSweepSettings;
import com.azure.resourcemanager.machinelearning.models.InputDeliveryMode;
import com.azure.resourcemanager.machinelearning.models.LearningRateScheduler;
import com.azure.resourcemanager.machinelearning.models.LogVerbosity;
import com.azure.resourcemanager.machinelearning.models.MLFlowModelJobInput;
import com.azure.resourcemanager.machinelearning.models.MLTableJobInput;
import com.azure.resourcemanager.machinelearning.models.SamplingAlgorithmType;
import com.azure.resourcemanager.machinelearning.models.StochasticOptimizer;
import java.time.Duration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ImageClassificationTests {
    @Test
    public void testDeserialize() {
        ImageClassification model =
            BinaryData
                .fromString(
                    "{\"taskType\":\"ImageClassification\",\"primaryMetric\":\"NormMacroRecall\",\"modelSettings\":{\"trainingCropSize\":857070249,\"validationCropSize\":372879313,\"validationResizeSize\":2040757308,\"weightedLoss\":601079141,\"advancedSettings\":\"pqitwe\",\"amsGradient\":false,\"augmentations\":\"vskbuhzacaq\",\"beta1\":35.776882,\"beta2\":7.5552106,\"checkpointFrequency\":1409246256,\"checkpointModel\":{\"jobInputType\":\"mlflow_model\",\"mode\":\"Download\",\"uri\":\"pdsxzakuejkm\",\"description\":\"iztjof\"},\"checkpointRunId\":\"vovjufycsjmlbe\",\"distributed\":false,\"earlyStopping\":true,\"earlyStoppingDelay\":1797904663,\"earlyStoppingPatience\":544161528,\"enableOnnxNormalization\":true,\"evaluationFrequency\":1168175827,\"gradientAccumulationStep\":920753916,\"layersToFreeze\":979183363,\"learningRate\":75.56595,\"learningRateScheduler\":\"None\",\"modelName\":\"jfel\",\"momentum\":99.81994,\"nesterov\":true,\"numberOfEpochs\":902490226,\"numberOfWorkers\":1270842979,\"optimizer\":\"Adam\",\"randomSeed\":1405675230,\"stepLRGamma\":4.9547615,\"stepLRStepSize\":462800461,\"trainingBatchSize\":1308773307,\"validationBatchSize\":1918220645,\"warmupCosineLRCycles\":88.28787,\"warmupCosineLRWarmupEpochs\":1219612283,\"weightDecay\":35.093628},\"searchSpace\":[{\"trainingCropSize\":\"ccgzpraoxnyu\",\"validationCropSize\":\"a\",\"validationResizeSize\":\"gftipwc\",\"weightedLoss\":\"yubhiqdx\",\"amsGradient\":\"rnpnuhzafccnuh\",\"augmentations\":\"gbylbuig\",\"beta1\":\"vatvcrkd\",\"beta2\":\"nbqxvhcsyhzlwxae\",\"distributed\":\"vurex\",\"earlyStopping\":\"d\",\"earlyStoppingDelay\":\"dwead\",\"earlyStoppingPatience\":\"zmwntopagt\",\"enableOnnxNormalization\":\"v\",\"evaluationFrequency\":\"agoaqylkjztji\",\"gradientAccumulationStep\":\"zjcg\",\"layersToFreeze\":\"itpfinzcpdl\",\"learningRate\":\"rlgjm\",\"learningRateScheduler\":\"drvcqguef\",\"modelName\":\"ompheqdur\",\"momentum\":\"yujlfyoumpckyecl\",\"nesterov\":\"igptajbrzmqxucyc\",\"numberOfEpochs\":\"oclxiut\",\"numberOfWorkers\":\"cyzyzjdnrqjbt\",\"optimizer\":\"eaoqaqbzgyhf\",\"randomSeed\":\"v\",\"stepLRGamma\":\"tbwbqamteuli\",\"stepLRStepSize\":\"lpkcvmwfauxxep\",\"trainingBatchSize\":\"wbormcqmi\",\"validationBatchSize\":\"ijqpkzfbojxjmcs\",\"warmupCosineLRCycles\":\"qwixvcpwnk\",\"warmupCosineLRWarmupEpochs\":\"wzwofalickduo\",\"weightDecay\":\"tamtyv\"},{\"trainingCropSize\":\"nxrwzawnvs\",\"validationCropSize\":\"fhzag\",\"validationResizeSize\":\"vhycvdimwrzregzg\",\"weightedLoss\":\"futrwpweryekzkd\",\"amsGradient\":\"eotta\",\"augmentations\":\"yos\",\"beta1\":\"whnhjtfv\",\"beta2\":\"dpmiljpn\",\"distributed\":\"nudqllz\",\"earlyStopping\":\"uzpjlxeehux\",\"earlyStoppingDelay\":\"hzlraymezxlsk\",\"earlyStoppingPatience\":\"mxrfdsa\",\"enableOnnxNormalization\":\"ednwyyshtu\",\"evaluationFrequency\":\"mevuafpwzy\",\"gradientAccumulationStep\":\"rkgwltxeqip\",\"layersToFreeze\":\"zdyi\",\"learningRate\":\"fayorpravkjoges\",\"learningRateScheduler\":\"bnsmjkwynqxaek\",\"modelName\":\"ykvwjtqpkevmyltj\",\"momentum\":\"spxklu\",\"nesterov\":\"clf\",\"numberOfEpochs\":\"annnoytzposewx\",\"numberOfWorkers\":\"pxvkqma\",\"optimizer\":\"xvpif\",\"randomSeed\":\"aifyzyzeyuubeids\",\"stepLRGamma\":\"fytoi\",\"stepLRStepSize\":\"gygvfltgvdiho\",\"trainingBatchSize\":\"krxwet\",\"validationBatchSize\":\"drcyrucpcun\",\"warmupCosineLRCycles\":\"zdqumoe\",\"warmupCosineLRWarmupEpochs\":\"dnaienhqhskndnel\",\"weightDecay\":\"aadl\"},{\"trainingCropSize\":\"wf\",\"validationCropSize\":\"nniyopetxi\",\"validationResizeSize\":\"nrlyxnuc\",\"weightedLoss\":\"p\",\"amsGradient\":\"lkwq\",\"augmentations\":\"tv\",\"beta1\":\"sdtcjbctvivuzqym\",\"beta2\":\"owog\",\"distributed\":\"it\",\"earlyStopping\":\"hzvb\",\"earlyStoppingDelay\":\"cdb\",\"earlyStoppingPatience\":\"fzndscxmxeatkd\",\"enableOnnxNormalization\":\"wnrdjyibqbnaom\",\"evaluationFrequency\":\"rmkuh\",\"gradientAccumulationStep\":\"xljalfihc\",\"layersToFreeze\":\"obcancdexxqcw\",\"learningRate\":\"xf\",\"learningRateScheduler\":\"aknokzwjjzrl\",\"modelName\":\"xldzyyfytpqsix\",\"momentum\":\"m\",\"nesterov\":\"jivyqlkjuv\",\"numberOfEpochs\":\"bmslzoyov\",\"numberOfWorkers\":\"dbpqvybefgvm\",\"optimizer\":\"okcvtlubses\",\"randomSeed\":\"cua\",\"stepLRGamma\":\"rhunlp\",\"stepLRStepSize\":\"ykycndzfqi\",\"trainingBatchSize\":\"reuykbbmnwagl\",\"validationBatchSize\":\"xoe\",\"warmupCosineLRCycles\":\"nqlnfwmyymvqd\",\"warmupCosineLRWarmupEpochs\":\"bhfckdvezcrcssb\",\"weightDecay\":\"ddubbnqfblhkal\"}],\"limitSettings\":{\"maxConcurrentTrials\":1165708950,\"maxTrials\":893248980,\"timeout\":\"PT229H8M42S\"},\"sweepSettings\":{\"earlyTermination\":{\"policyType\":\"EarlyTerminationPolicy\",\"delayEvaluation\":536414260,\"evaluationInterval\":693878843},\"samplingAlgorithm\":\"Bayesian\"},\"validationData\":{\"jobInputType\":\"mltable\",\"mode\":\"ReadOnlyMount\",\"uri\":\"gdmin\",\"description\":\"tteajohiygs\"},\"validationDataSize\":75.70753002197551,\"logVerbosity\":\"Debug\",\"targetColumnName\":\"czykmktpvw\",\"trainingData\":{\"jobInputType\":\"mltable\",\"mode\":\"EvalMount\",\"uri\":\"sehch\",\"description\":\"ufmpqumqyjgy\"}}")
                .toObject(ImageClassification.class);
        Assertions.assertEquals(LogVerbosity.DEBUG, model.logVerbosity());
        Assertions.assertEquals("czykmktpvw", model.targetColumnName());
        Assertions.assertEquals("ufmpqumqyjgy", model.trainingData().description());
        Assertions.assertEquals(InputDeliveryMode.EVAL_MOUNT, model.trainingData().mode());
        Assertions.assertEquals("sehch", model.trainingData().uri());
        Assertions.assertEquals(ClassificationPrimaryMetrics.NORM_MACRO_RECALL, model.primaryMetric());
        Assertions.assertEquals("pqitwe", model.modelSettings().advancedSettings());
        Assertions.assertEquals(false, model.modelSettings().amsGradient());
        Assertions.assertEquals("vskbuhzacaq", model.modelSettings().augmentations());
        Assertions.assertEquals(35.776882F, model.modelSettings().beta1());
        Assertions.assertEquals(7.5552106F, model.modelSettings().beta2());
        Assertions.assertEquals(1409246256, model.modelSettings().checkpointFrequency());
        Assertions.assertEquals("iztjof", model.modelSettings().checkpointModel().description());
        Assertions.assertEquals(InputDeliveryMode.DOWNLOAD, model.modelSettings().checkpointModel().mode());
        Assertions.assertEquals("pdsxzakuejkm", model.modelSettings().checkpointModel().uri());
        Assertions.assertEquals("vovjufycsjmlbe", model.modelSettings().checkpointRunId());
        Assertions.assertEquals(false, model.modelSettings().distributed());
        Assertions.assertEquals(true, model.modelSettings().earlyStopping());
        Assertions.assertEquals(1797904663, model.modelSettings().earlyStoppingDelay());
        Assertions.assertEquals(544161528, model.modelSettings().earlyStoppingPatience());
        Assertions.assertEquals(true, model.modelSettings().enableOnnxNormalization());
        Assertions.assertEquals(1168175827, model.modelSettings().evaluationFrequency());
        Assertions.assertEquals(920753916, model.modelSettings().gradientAccumulationStep());
        Assertions.assertEquals(979183363, model.modelSettings().layersToFreeze());
        Assertions.assertEquals(75.56595F, model.modelSettings().learningRate());
        Assertions.assertEquals(LearningRateScheduler.NONE, model.modelSettings().learningRateScheduler());
        Assertions.assertEquals("jfel", model.modelSettings().modelName());
        Assertions.assertEquals(99.81994F, model.modelSettings().momentum());
        Assertions.assertEquals(true, model.modelSettings().nesterov());
        Assertions.assertEquals(902490226, model.modelSettings().numberOfEpochs());
        Assertions.assertEquals(1270842979, model.modelSettings().numberOfWorkers());
        Assertions.assertEquals(StochasticOptimizer.ADAM, model.modelSettings().optimizer());
        Assertions.assertEquals(1405675230, model.modelSettings().randomSeed());
        Assertions.assertEquals(4.9547615F, model.modelSettings().stepLRGamma());
        Assertions.assertEquals(462800461, model.modelSettings().stepLRStepSize());
        Assertions.assertEquals(1308773307, model.modelSettings().trainingBatchSize());
        Assertions.assertEquals(1918220645, model.modelSettings().validationBatchSize());
        Assertions.assertEquals(88.28787F, model.modelSettings().warmupCosineLRCycles());
        Assertions.assertEquals(1219612283, model.modelSettings().warmupCosineLRWarmupEpochs());
        Assertions.assertEquals(35.093628F, model.modelSettings().weightDecay());
        Assertions.assertEquals(857070249, model.modelSettings().trainingCropSize());
        Assertions.assertEquals(372879313, model.modelSettings().validationCropSize());
        Assertions.assertEquals(2040757308, model.modelSettings().validationResizeSize());
        Assertions.assertEquals(601079141, model.modelSettings().weightedLoss());
        Assertions.assertEquals("rnpnuhzafccnuh", model.searchSpace().get(0).amsGradient());
        Assertions.assertEquals("gbylbuig", model.searchSpace().get(0).augmentations());
        Assertions.assertEquals("vatvcrkd", model.searchSpace().get(0).beta1());
        Assertions.assertEquals("nbqxvhcsyhzlwxae", model.searchSpace().get(0).beta2());
        Assertions.assertEquals("vurex", model.searchSpace().get(0).distributed());
        Assertions.assertEquals("d", model.searchSpace().get(0).earlyStopping());
        Assertions.assertEquals("dwead", model.searchSpace().get(0).earlyStoppingDelay());
        Assertions.assertEquals("zmwntopagt", model.searchSpace().get(0).earlyStoppingPatience());
        Assertions.assertEquals("v", model.searchSpace().get(0).enableOnnxNormalization());
        Assertions.assertEquals("agoaqylkjztji", model.searchSpace().get(0).evaluationFrequency());
        Assertions.assertEquals("zjcg", model.searchSpace().get(0).gradientAccumulationStep());
        Assertions.assertEquals("itpfinzcpdl", model.searchSpace().get(0).layersToFreeze());
        Assertions.assertEquals("rlgjm", model.searchSpace().get(0).learningRate());
        Assertions.assertEquals("drvcqguef", model.searchSpace().get(0).learningRateScheduler());
        Assertions.assertEquals("ompheqdur", model.searchSpace().get(0).modelName());
        Assertions.assertEquals("yujlfyoumpckyecl", model.searchSpace().get(0).momentum());
        Assertions.assertEquals("igptajbrzmqxucyc", model.searchSpace().get(0).nesterov());
        Assertions.assertEquals("oclxiut", model.searchSpace().get(0).numberOfEpochs());
        Assertions.assertEquals("cyzyzjdnrqjbt", model.searchSpace().get(0).numberOfWorkers());
        Assertions.assertEquals("eaoqaqbzgyhf", model.searchSpace().get(0).optimizer());
        Assertions.assertEquals("v", model.searchSpace().get(0).randomSeed());
        Assertions.assertEquals("tbwbqamteuli", model.searchSpace().get(0).stepLRGamma());
        Assertions.assertEquals("lpkcvmwfauxxep", model.searchSpace().get(0).stepLRStepSize());
        Assertions.assertEquals("wbormcqmi", model.searchSpace().get(0).trainingBatchSize());
        Assertions.assertEquals("ijqpkzfbojxjmcs", model.searchSpace().get(0).validationBatchSize());
        Assertions.assertEquals("qwixvcpwnk", model.searchSpace().get(0).warmupCosineLRCycles());
        Assertions.assertEquals("wzwofalickduo", model.searchSpace().get(0).warmupCosineLRWarmupEpochs());
        Assertions.assertEquals("tamtyv", model.searchSpace().get(0).weightDecay());
        Assertions.assertEquals("ccgzpraoxnyu", model.searchSpace().get(0).trainingCropSize());
        Assertions.assertEquals("a", model.searchSpace().get(0).validationCropSize());
        Assertions.assertEquals("gftipwc", model.searchSpace().get(0).validationResizeSize());
        Assertions.assertEquals("yubhiqdx", model.searchSpace().get(0).weightedLoss());
        Assertions.assertEquals(1165708950, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals(893248980, model.limitSettings().maxTrials());
        Assertions.assertEquals(Duration.parse("PT229H8M42S"), model.limitSettings().timeout());
        Assertions.assertEquals(536414260, model.sweepSettings().earlyTermination().delayEvaluation());
        Assertions.assertEquals(693878843, model.sweepSettings().earlyTermination().evaluationInterval());
        Assertions.assertEquals(SamplingAlgorithmType.BAYESIAN, model.sweepSettings().samplingAlgorithm());
        Assertions.assertEquals("tteajohiygs", model.validationData().description());
        Assertions.assertEquals(InputDeliveryMode.READ_ONLY_MOUNT, model.validationData().mode());
        Assertions.assertEquals("gdmin", model.validationData().uri());
        Assertions.assertEquals(75.70753002197551D, model.validationDataSize());
    }

    @Test
    public void testSerialize() {
        ImageClassification model =
            new ImageClassification()
                .withLogVerbosity(LogVerbosity.DEBUG)
                .withTargetColumnName("czykmktpvw")
                .withTrainingData(
                    new MLTableJobInput()
                        .withDescription("ufmpqumqyjgy")
                        .withMode(InputDeliveryMode.EVAL_MOUNT)
                        .withUri("sehch"))
                .withPrimaryMetric(ClassificationPrimaryMetrics.NORM_MACRO_RECALL)
                .withModelSettings(
                    new ImageModelSettingsClassification()
                        .withAdvancedSettings("pqitwe")
                        .withAmsGradient(false)
                        .withAugmentations("vskbuhzacaq")
                        .withBeta1(35.776882F)
                        .withBeta2(7.5552106F)
                        .withCheckpointFrequency(1409246256)
                        .withCheckpointModel(
                            new MLFlowModelJobInput()
                                .withDescription("iztjof")
                                .withMode(InputDeliveryMode.DOWNLOAD)
                                .withUri("pdsxzakuejkm"))
                        .withCheckpointRunId("vovjufycsjmlbe")
                        .withDistributed(false)
                        .withEarlyStopping(true)
                        .withEarlyStoppingDelay(1797904663)
                        .withEarlyStoppingPatience(544161528)
                        .withEnableOnnxNormalization(true)
                        .withEvaluationFrequency(1168175827)
                        .withGradientAccumulationStep(920753916)
                        .withLayersToFreeze(979183363)
                        .withLearningRate(75.56595F)
                        .withLearningRateScheduler(LearningRateScheduler.NONE)
                        .withModelName("jfel")
                        .withMomentum(99.81994F)
                        .withNesterov(true)
                        .withNumberOfEpochs(902490226)
                        .withNumberOfWorkers(1270842979)
                        .withOptimizer(StochasticOptimizer.ADAM)
                        .withRandomSeed(1405675230)
                        .withStepLRGamma(4.9547615F)
                        .withStepLRStepSize(462800461)
                        .withTrainingBatchSize(1308773307)
                        .withValidationBatchSize(1918220645)
                        .withWarmupCosineLRCycles(88.28787F)
                        .withWarmupCosineLRWarmupEpochs(1219612283)
                        .withWeightDecay(35.093628F)
                        .withTrainingCropSize(857070249)
                        .withValidationCropSize(372879313)
                        .withValidationResizeSize(2040757308)
                        .withWeightedLoss(601079141))
                .withSearchSpace(
                    Arrays
                        .asList(
                            new ImageModelDistributionSettingsClassification()
                                .withAmsGradient("rnpnuhzafccnuh")
                                .withAugmentations("gbylbuig")
                                .withBeta1("vatvcrkd")
                                .withBeta2("nbqxvhcsyhzlwxae")
                                .withDistributed("vurex")
                                .withEarlyStopping("d")
                                .withEarlyStoppingDelay("dwead")
                                .withEarlyStoppingPatience("zmwntopagt")
                                .withEnableOnnxNormalization("v")
                                .withEvaluationFrequency("agoaqylkjztji")
                                .withGradientAccumulationStep("zjcg")
                                .withLayersToFreeze("itpfinzcpdl")
                                .withLearningRate("rlgjm")
                                .withLearningRateScheduler("drvcqguef")
                                .withModelName("ompheqdur")
                                .withMomentum("yujlfyoumpckyecl")
                                .withNesterov("igptajbrzmqxucyc")
                                .withNumberOfEpochs("oclxiut")
                                .withNumberOfWorkers("cyzyzjdnrqjbt")
                                .withOptimizer("eaoqaqbzgyhf")
                                .withRandomSeed("v")
                                .withStepLRGamma("tbwbqamteuli")
                                .withStepLRStepSize("lpkcvmwfauxxep")
                                .withTrainingBatchSize("wbormcqmi")
                                .withValidationBatchSize("ijqpkzfbojxjmcs")
                                .withWarmupCosineLRCycles("qwixvcpwnk")
                                .withWarmupCosineLRWarmupEpochs("wzwofalickduo")
                                .withWeightDecay("tamtyv")
                                .withTrainingCropSize("ccgzpraoxnyu")
                                .withValidationCropSize("a")
                                .withValidationResizeSize("gftipwc")
                                .withWeightedLoss("yubhiqdx"),
                            new ImageModelDistributionSettingsClassification()
                                .withAmsGradient("eotta")
                                .withAugmentations("yos")
                                .withBeta1("whnhjtfv")
                                .withBeta2("dpmiljpn")
                                .withDistributed("nudqllz")
                                .withEarlyStopping("uzpjlxeehux")
                                .withEarlyStoppingDelay("hzlraymezxlsk")
                                .withEarlyStoppingPatience("mxrfdsa")
                                .withEnableOnnxNormalization("ednwyyshtu")
                                .withEvaluationFrequency("mevuafpwzy")
                                .withGradientAccumulationStep("rkgwltxeqip")
                                .withLayersToFreeze("zdyi")
                                .withLearningRate("fayorpravkjoges")
                                .withLearningRateScheduler("bnsmjkwynqxaek")
                                .withModelName("ykvwjtqpkevmyltj")
                                .withMomentum("spxklu")
                                .withNesterov("clf")
                                .withNumberOfEpochs("annnoytzposewx")
                                .withNumberOfWorkers("pxvkqma")
                                .withOptimizer("xvpif")
                                .withRandomSeed("aifyzyzeyuubeids")
                                .withStepLRGamma("fytoi")
                                .withStepLRStepSize("gygvfltgvdiho")
                                .withTrainingBatchSize("krxwet")
                                .withValidationBatchSize("drcyrucpcun")
                                .withWarmupCosineLRCycles("zdqumoe")
                                .withWarmupCosineLRWarmupEpochs("dnaienhqhskndnel")
                                .withWeightDecay("aadl")
                                .withTrainingCropSize("nxrwzawnvs")
                                .withValidationCropSize("fhzag")
                                .withValidationResizeSize("vhycvdimwrzregzg")
                                .withWeightedLoss("futrwpweryekzkd"),
                            new ImageModelDistributionSettingsClassification()
                                .withAmsGradient("lkwq")
                                .withAugmentations("tv")
                                .withBeta1("sdtcjbctvivuzqym")
                                .withBeta2("owog")
                                .withDistributed("it")
                                .withEarlyStopping("hzvb")
                                .withEarlyStoppingDelay("cdb")
                                .withEarlyStoppingPatience("fzndscxmxeatkd")
                                .withEnableOnnxNormalization("wnrdjyibqbnaom")
                                .withEvaluationFrequency("rmkuh")
                                .withGradientAccumulationStep("xljalfihc")
                                .withLayersToFreeze("obcancdexxqcw")
                                .withLearningRate("xf")
                                .withLearningRateScheduler("aknokzwjjzrl")
                                .withModelName("xldzyyfytpqsix")
                                .withMomentum("m")
                                .withNesterov("jivyqlkjuv")
                                .withNumberOfEpochs("bmslzoyov")
                                .withNumberOfWorkers("dbpqvybefgvm")
                                .withOptimizer("okcvtlubses")
                                .withRandomSeed("cua")
                                .withStepLRGamma("rhunlp")
                                .withStepLRStepSize("ykycndzfqi")
                                .withTrainingBatchSize("reuykbbmnwagl")
                                .withValidationBatchSize("xoe")
                                .withWarmupCosineLRCycles("nqlnfwmyymvqd")
                                .withWarmupCosineLRWarmupEpochs("bhfckdvezcrcssb")
                                .withWeightDecay("ddubbnqfblhkal")
                                .withTrainingCropSize("wf")
                                .withValidationCropSize("nniyopetxi")
                                .withValidationResizeSize("nrlyxnuc")
                                .withWeightedLoss("p")))
                .withLimitSettings(
                    new ImageLimitSettings()
                        .withMaxConcurrentTrials(1165708950)
                        .withMaxTrials(893248980)
                        .withTimeout(Duration.parse("PT229H8M42S")))
                .withSweepSettings(
                    new ImageSweepSettings()
                        .withEarlyTermination(
                            new EarlyTerminationPolicy()
                                .withDelayEvaluation(536414260)
                                .withEvaluationInterval(693878843))
                        .withSamplingAlgorithm(SamplingAlgorithmType.BAYESIAN))
                .withValidationData(
                    new MLTableJobInput()
                        .withDescription("tteajohiygs")
                        .withMode(InputDeliveryMode.READ_ONLY_MOUNT)
                        .withUri("gdmin"))
                .withValidationDataSize(75.70753002197551D);
        model = BinaryData.fromObject(model).toObject(ImageClassification.class);
        Assertions.assertEquals(LogVerbosity.DEBUG, model.logVerbosity());
        Assertions.assertEquals("czykmktpvw", model.targetColumnName());
        Assertions.assertEquals("ufmpqumqyjgy", model.trainingData().description());
        Assertions.assertEquals(InputDeliveryMode.EVAL_MOUNT, model.trainingData().mode());
        Assertions.assertEquals("sehch", model.trainingData().uri());
        Assertions.assertEquals(ClassificationPrimaryMetrics.NORM_MACRO_RECALL, model.primaryMetric());
        Assertions.assertEquals("pqitwe", model.modelSettings().advancedSettings());
        Assertions.assertEquals(false, model.modelSettings().amsGradient());
        Assertions.assertEquals("vskbuhzacaq", model.modelSettings().augmentations());
        Assertions.assertEquals(35.776882F, model.modelSettings().beta1());
        Assertions.assertEquals(7.5552106F, model.modelSettings().beta2());
        Assertions.assertEquals(1409246256, model.modelSettings().checkpointFrequency());
        Assertions.assertEquals("iztjof", model.modelSettings().checkpointModel().description());
        Assertions.assertEquals(InputDeliveryMode.DOWNLOAD, model.modelSettings().checkpointModel().mode());
        Assertions.assertEquals("pdsxzakuejkm", model.modelSettings().checkpointModel().uri());
        Assertions.assertEquals("vovjufycsjmlbe", model.modelSettings().checkpointRunId());
        Assertions.assertEquals(false, model.modelSettings().distributed());
        Assertions.assertEquals(true, model.modelSettings().earlyStopping());
        Assertions.assertEquals(1797904663, model.modelSettings().earlyStoppingDelay());
        Assertions.assertEquals(544161528, model.modelSettings().earlyStoppingPatience());
        Assertions.assertEquals(true, model.modelSettings().enableOnnxNormalization());
        Assertions.assertEquals(1168175827, model.modelSettings().evaluationFrequency());
        Assertions.assertEquals(920753916, model.modelSettings().gradientAccumulationStep());
        Assertions.assertEquals(979183363, model.modelSettings().layersToFreeze());
        Assertions.assertEquals(75.56595F, model.modelSettings().learningRate());
        Assertions.assertEquals(LearningRateScheduler.NONE, model.modelSettings().learningRateScheduler());
        Assertions.assertEquals("jfel", model.modelSettings().modelName());
        Assertions.assertEquals(99.81994F, model.modelSettings().momentum());
        Assertions.assertEquals(true, model.modelSettings().nesterov());
        Assertions.assertEquals(902490226, model.modelSettings().numberOfEpochs());
        Assertions.assertEquals(1270842979, model.modelSettings().numberOfWorkers());
        Assertions.assertEquals(StochasticOptimizer.ADAM, model.modelSettings().optimizer());
        Assertions.assertEquals(1405675230, model.modelSettings().randomSeed());
        Assertions.assertEquals(4.9547615F, model.modelSettings().stepLRGamma());
        Assertions.assertEquals(462800461, model.modelSettings().stepLRStepSize());
        Assertions.assertEquals(1308773307, model.modelSettings().trainingBatchSize());
        Assertions.assertEquals(1918220645, model.modelSettings().validationBatchSize());
        Assertions.assertEquals(88.28787F, model.modelSettings().warmupCosineLRCycles());
        Assertions.assertEquals(1219612283, model.modelSettings().warmupCosineLRWarmupEpochs());
        Assertions.assertEquals(35.093628F, model.modelSettings().weightDecay());
        Assertions.assertEquals(857070249, model.modelSettings().trainingCropSize());
        Assertions.assertEquals(372879313, model.modelSettings().validationCropSize());
        Assertions.assertEquals(2040757308, model.modelSettings().validationResizeSize());
        Assertions.assertEquals(601079141, model.modelSettings().weightedLoss());
        Assertions.assertEquals("rnpnuhzafccnuh", model.searchSpace().get(0).amsGradient());
        Assertions.assertEquals("gbylbuig", model.searchSpace().get(0).augmentations());
        Assertions.assertEquals("vatvcrkd", model.searchSpace().get(0).beta1());
        Assertions.assertEquals("nbqxvhcsyhzlwxae", model.searchSpace().get(0).beta2());
        Assertions.assertEquals("vurex", model.searchSpace().get(0).distributed());
        Assertions.assertEquals("d", model.searchSpace().get(0).earlyStopping());
        Assertions.assertEquals("dwead", model.searchSpace().get(0).earlyStoppingDelay());
        Assertions.assertEquals("zmwntopagt", model.searchSpace().get(0).earlyStoppingPatience());
        Assertions.assertEquals("v", model.searchSpace().get(0).enableOnnxNormalization());
        Assertions.assertEquals("agoaqylkjztji", model.searchSpace().get(0).evaluationFrequency());
        Assertions.assertEquals("zjcg", model.searchSpace().get(0).gradientAccumulationStep());
        Assertions.assertEquals("itpfinzcpdl", model.searchSpace().get(0).layersToFreeze());
        Assertions.assertEquals("rlgjm", model.searchSpace().get(0).learningRate());
        Assertions.assertEquals("drvcqguef", model.searchSpace().get(0).learningRateScheduler());
        Assertions.assertEquals("ompheqdur", model.searchSpace().get(0).modelName());
        Assertions.assertEquals("yujlfyoumpckyecl", model.searchSpace().get(0).momentum());
        Assertions.assertEquals("igptajbrzmqxucyc", model.searchSpace().get(0).nesterov());
        Assertions.assertEquals("oclxiut", model.searchSpace().get(0).numberOfEpochs());
        Assertions.assertEquals("cyzyzjdnrqjbt", model.searchSpace().get(0).numberOfWorkers());
        Assertions.assertEquals("eaoqaqbzgyhf", model.searchSpace().get(0).optimizer());
        Assertions.assertEquals("v", model.searchSpace().get(0).randomSeed());
        Assertions.assertEquals("tbwbqamteuli", model.searchSpace().get(0).stepLRGamma());
        Assertions.assertEquals("lpkcvmwfauxxep", model.searchSpace().get(0).stepLRStepSize());
        Assertions.assertEquals("wbormcqmi", model.searchSpace().get(0).trainingBatchSize());
        Assertions.assertEquals("ijqpkzfbojxjmcs", model.searchSpace().get(0).validationBatchSize());
        Assertions.assertEquals("qwixvcpwnk", model.searchSpace().get(0).warmupCosineLRCycles());
        Assertions.assertEquals("wzwofalickduo", model.searchSpace().get(0).warmupCosineLRWarmupEpochs());
        Assertions.assertEquals("tamtyv", model.searchSpace().get(0).weightDecay());
        Assertions.assertEquals("ccgzpraoxnyu", model.searchSpace().get(0).trainingCropSize());
        Assertions.assertEquals("a", model.searchSpace().get(0).validationCropSize());
        Assertions.assertEquals("gftipwc", model.searchSpace().get(0).validationResizeSize());
        Assertions.assertEquals("yubhiqdx", model.searchSpace().get(0).weightedLoss());
        Assertions.assertEquals(1165708950, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals(893248980, model.limitSettings().maxTrials());
        Assertions.assertEquals(Duration.parse("PT229H8M42S"), model.limitSettings().timeout());
        Assertions.assertEquals(536414260, model.sweepSettings().earlyTermination().delayEvaluation());
        Assertions.assertEquals(693878843, model.sweepSettings().earlyTermination().evaluationInterval());
        Assertions.assertEquals(SamplingAlgorithmType.BAYESIAN, model.sweepSettings().samplingAlgorithm());
        Assertions.assertEquals("tteajohiygs", model.validationData().description());
        Assertions.assertEquals(InputDeliveryMode.READ_ONLY_MOUNT, model.validationData().mode());
        Assertions.assertEquals("gdmin", model.validationData().uri());
        Assertions.assertEquals(75.70753002197551D, model.validationDataSize());
    }
}