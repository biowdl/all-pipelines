organization := "com.github.biopet"
name := "Root"

scalaVersion := "2.11.12"

biopetUrlName := "root"

biopetIsTool := false

developers += Developer(id = "ffinfo",
                        name = "Peter van 't Hof",
                        email = "pjrvanthof@gmail.com",
                        url = url("https://github.com/ffinfo"))

lazy val root = (project in file("."))

lazy val Aligning = project in file("aligning")
lazy val BamMetrics = project in file("BamMetrics")
lazy val BamToGvcf = project in file("bam-to-gvcf")
lazy val ChIPseq = project in file("ChIP-seq")
lazy val ExpressionQuantification = project in file("expression-quantification")
lazy val Gams = project in file("gams")
lazy val GatkPreprocess = project in file("gatk-preprocess")
lazy val GermlineDNA = project in file("germline-DNA")
lazy val Jointgenotyping = project in file("jointgenotyping")
lazy val PipelineTemplate = project in file("pipeline-template")
lazy val QC = project in file("QC")
lazy val RNAseq = project in file("RNA-seq")
lazy val SomaticVariantcalling = project in file("somatic-variantcalling")
