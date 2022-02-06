<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:c05fa693-7cb6-4264-9df9-0b651c15f8fd(NewLanguage.sandbox)">
  <persistence version="9" />
  <languages>
    <use id="59f9da20-e62a-4a82-8c2d-8a77f06056f1" name="NewLanguage" version="0" />
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="11" />
  </languages>
  <imports>
    <import index="pvmi" ref="r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)" />
    <import index="3j5z" ref="r:532e02a5-0bd8-4390-adcd-a48323f88271(NewLanguage.editor)" />
  </imports>
  <registry>
    <language id="59f9da20-e62a-4a82-8c2d-8a77f06056f1" name="NewLanguage">
      <concept id="7547171304064999959" name="NewLanguage.structure.RepresentationInterface" flags="ng" index="lr197">
        <property id="7547171304065569737" name="type" index="lpmep" />
        <child id="7547171304065180757" name="textUI" index="lrPg5" />
        <child id="7547171304065144684" name="imageUI" index="lrYsW" />
      </concept>
      <concept id="7547171304065000741" name="NewLanguage.structure.DatasetType" flags="ng" index="lr1lP" />
      <concept id="7547171304065049673" name="NewLanguage.structure.ImageMessage" flags="ng" index="lrlgp" />
      <concept id="7547171304065052449" name="NewLanguage.structure.FileMessage" flags="ng" index="lrlXL" />
      <concept id="7547171304065043495" name="NewLanguage.structure.TextMessage" flags="ng" index="lrnLR" />
      <concept id="7547171304065009827" name="NewLanguage.structure.DocumentType" flags="ng" index="lrvzN" />
      <concept id="7547171304065010671" name="NewLanguage.structure.MessageType" flags="ng" index="lrvIZ">
        <child id="7547171304065511646" name="fileMessage" index="lp42e" />
        <child id="7547171304065511651" name="imageMessage" index="lp42N" />
        <child id="7547171304065511658" name="textMessage" index="lp42U" />
      </concept>
      <concept id="7547171304065175498" name="NewLanguage.structure.TextUI" flags="ng" index="lrRYq" />
      <concept id="7547171304065161929" name="NewLanguage.structure.ImageUI" flags="ng" index="lrUEp" />
      <concept id="7547171304064479233" name="NewLanguage.structure.Datatype" flags="ng" index="lt01h">
        <child id="7547171304064479288" name="entities" index="lt01C" />
      </concept>
      <concept id="7547171304064479638" name="NewLanguage.structure.Entity" flags="ng" index="lt076">
        <child id="7547171304064508053" name="atributes" index="ltp35" />
      </concept>
      <concept id="7547171304064545345" name="NewLanguage.structure.User" flags="ng" index="ltg8h">
        <property id="7547171304064545768" name="type" index="ltgeS" />
        <child id="7547171304065022179" name="userInterface" index="lrsyN" />
      </concept>
      <concept id="7547171304064575937" name="NewLanguage.structure.CommunicationInterface" flags="ng" index="ltDAh">
        <child id="7547171304065187066" name="datasetType" index="lrOME" />
        <child id="7547171304065143747" name="messageType" index="lrYej" />
        <child id="7547171304065143742" name="documentType" index="lrYfI" />
      </concept>
      <concept id="7547171304064625072" name="NewLanguage.structure.UserInterface" flags="ng" index="ltXBw">
        <child id="7547171304065042652" name="representationInterface" index="lrnyc" />
        <child id="7547171304065179702" name="communicationInterface" index="lrP1A" />
      </concept>
      <concept id="7547171304068162374" name="NewLanguage.structure.Attributes" flags="ng" index="mJtcm">
        <property id="7547171304068164310" name="type" index="mJtE6" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="ltg8h" id="6yWW51XRXwC">
    <property role="TrG5h" value="ApplicationUser" />
    <property role="ltgeS" value="6yWW51XMvfF/Doctor" />
    <node concept="ltXBw" id="6yWW51XRXwD" role="lrsyN">
      <property role="TrG5h" value="BasicUI" />
      <node concept="ltDAh" id="6yWW51XU9YI" role="lrP1A">
        <property role="TrG5h" value="BasicUI" />
        <node concept="lr1lP" id="6yWW51XXMzg" role="lrOME">
          <property role="TrG5h" value="DataDB" />
        </node>
        <node concept="lrvIZ" id="6yWW51XXa2V" role="lrYej">
          <property role="TrG5h" value="File/Image/Text" />
          <node concept="lrnLR" id="6yWW51XXMze" role="lp42U">
            <property role="TrG5h" value="sendtext" />
          </node>
          <node concept="lrlgp" id="6yWW51XXMzc" role="lp42N">
            <property role="TrG5h" value="uploadimage" />
          </node>
          <node concept="lrlXL" id="6yWW51XXMza" role="lp42e">
            <property role="TrG5h" value="uploadfile" />
          </node>
        </node>
        <node concept="lrvzN" id="6yWW51XUunZ" role="lrYfI">
          <property role="TrG5h" value="FileUpload" />
        </node>
      </node>
      <node concept="lr197" id="6yWW51XT2aD" role="lrnyc">
        <property role="TrG5h" value="PatientProfileView" />
        <property role="lpmep" value="6yWW51XRTs6/PatientDetails" />
        <node concept="lrRYq" id="6yWW51XT2aH" role="lrPg5">
          <property role="TrG5h" value="PatientHistory" />
        </node>
        <node concept="lrUEp" id="6yWW51XT2aF" role="lrYsW">
          <property role="TrG5h" value="PatientPhoto" />
        </node>
      </node>
    </node>
  </node>
  <node concept="lt01h" id="6yWW51Y1yVe">
    <property role="TrG5h" value="BasicDatatypes" />
    <node concept="lt076" id="6yWW51Y2T6E" role="lt01C">
      <property role="TrG5h" value="AttributeExistence" />
      <node concept="mJtcm" id="6yWW51Y2T6F" role="ltp35">
        <property role="TrG5h" value="IntegerPlacement" />
        <property role="mJtE6" value="6yWW51XMm28/INTEGER" />
      </node>
      <node concept="mJtcm" id="6yWW51Y2T6I" role="ltp35">
        <property role="mJtE6" value="6yWW51XMm29/STRING" />
        <property role="TrG5h" value="StringPlacement" />
      </node>
      <node concept="mJtcm" id="6yWW51Y2T6L" role="ltp35">
        <property role="TrG5h" value="BooleanPlacement" />
        <property role="mJtE6" value="6yWW51XMm2c/BOOLEAN" />
      </node>
    </node>
  </node>
</model>

