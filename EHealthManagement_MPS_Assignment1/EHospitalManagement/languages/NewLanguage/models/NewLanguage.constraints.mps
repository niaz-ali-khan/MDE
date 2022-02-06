<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:3bc22c4c-32ba-4f29-a753-a3619960013b(NewLanguage.constraints)">
  <persistence version="9" />
  <languages>
    <use id="5dae8159-ab99-46bb-a40d-0cee30ee7018" name="jetbrains.mps.lang.constraints.rules.kinds" version="0" />
    <use id="ea3159bf-f48e-4720-bde2-86dba75f0d34" name="jetbrains.mps.lang.context.defs" version="0" />
    <use id="e51810c5-7308-4642-bcb6-469e61b5dd18" name="jetbrains.mps.lang.constraints.msg.specification" version="0" />
    <use id="134c38d4-e3af-4d9e-b069-1c7df0a4005d" name="jetbrains.mps.lang.constraints.rules.skeleton" version="0" />
    <use id="b3551702-269c-4f05-ba61-58060cef4292" name="jetbrains.mps.lang.rulesAndMessages" version="0" />
    <use id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints" version="6" />
    <use id="13744753-c81f-424a-9c1b-cf8943bf4e86" name="jetbrains.mps.lang.sharedConcepts" version="0" />
    <use id="3ad5badc-1d9c-461c-b7b1-fa2fcd0a0ae7" name="jetbrains.mps.lang.context" version="0" />
    <use id="ad93155d-79b2-4759-b10c-55123e763903" name="jetbrains.mps.lang.messages" version="0" />
    <devkit ref="00000000-0000-4000-0000-5604ebd4f22c(jetbrains.mps.devkit.aspect.constraints)" />
  </languages>
  <imports>
    <import index="pvmi" ref="r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1080120340718" name="jetbrains.mps.baseLanguage.structure.AndExpression" flags="nn" index="1Wc70l" />
    </language>
    <language id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints">
      <concept id="6702802731807351367" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_CanBeAChild" flags="in" index="9S07l" />
      <concept id="1202989658459" name="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_parentNode" flags="nn" index="nLn13" />
      <concept id="1213093968558" name="jetbrains.mps.lang.constraints.structure.ConceptConstraints" flags="ng" index="1M2fIO">
        <reference id="1213093996982" name="concept" index="1M2myG" />
        <child id="6702802731807737306" name="canBeChild" index="9Vyp8" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1139613262185" name="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" flags="nn" index="1mfA1w" />
      <concept id="1139621453865" name="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" flags="nn" index="1mIQ4w">
        <child id="1177027386292" name="conceptArgument" index="cj9EA" />
      </concept>
    </language>
  </registry>
  <node concept="1M2fIO" id="6yWW51XP18q">
    <ref role="1M2myG" to="pvmi:6yWW51XOPF9" resolve="ImageUI" />
    <node concept="9S07l" id="6yWW51XP2RB" role="9Vyp8">
      <node concept="3clFbS" id="6yWW51XP2RC" role="2VODD2">
        <node concept="3clFbF" id="6yWW51XP3EF" role="3cqZAp">
          <node concept="1Wc70l" id="6yWW51XP8FE" role="3clFbG">
            <node concept="2OqwBi" id="6yWW51XPap7" role="3uHU7w">
              <node concept="2OqwBi" id="6yWW51XP92o" role="2Oq$k0">
                <node concept="nLn13" id="6yWW51XP8RF" role="2Oq$k0" />
                <node concept="1mfA1w" id="6yWW51XP9tR" role="2OqNvi" />
              </node>
              <node concept="1mIQ4w" id="6yWW51XPa$G" role="2OqNvi">
                <node concept="chp4Y" id="6yWW51XPaO_" role="cj9EA">
                  <ref role="cht4Q" to="pvmi:6yWW51XMMAK" resolve="UserInterface" />
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="6yWW51XP4BG" role="3uHU7B">
              <node concept="nLn13" id="6yWW51XP3EE" role="2Oq$k0" />
              <node concept="1mIQ4w" id="6yWW51XP6fN" role="2OqNvi">
                <node concept="chp4Y" id="6yWW51XP78z" role="cj9EA">
                  <ref role="cht4Q" to="pvmi:6yWW51XOe8n" resolve="RepresentationInterface" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="6yWW51XPbZv">
    <ref role="1M2myG" to="pvmi:6yWW51XOSZa" resolve="TextUI" />
    <node concept="9S07l" id="6yWW51XPcOF" role="9Vyp8">
      <node concept="3clFbS" id="6yWW51XPcOG" role="2VODD2">
        <node concept="3clFbF" id="6yWW51XPcSG" role="3cqZAp">
          <node concept="1Wc70l" id="6yWW51XPfpc" role="3clFbG">
            <node concept="2OqwBi" id="6yWW51XPg0h" role="3uHU7w">
              <node concept="2OqwBi" id="6yWW51XPfIo" role="2Oq$k0">
                <node concept="nLn13" id="6yWW51XPftZ" role="2Oq$k0" />
                <node concept="1mfA1w" id="6yWW51XPfVm" role="2OqNvi" />
              </node>
              <node concept="1mIQ4w" id="6yWW51XPgAk" role="2OqNvi">
                <node concept="chp4Y" id="6yWW51XPgFk" role="cj9EA">
                  <ref role="cht4Q" to="pvmi:6yWW51XMMAK" resolve="UserInterface" />
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="6yWW51XPd1r" role="3uHU7B">
              <node concept="nLn13" id="6yWW51XPcSF" role="2Oq$k0" />
              <node concept="1mIQ4w" id="6yWW51XPdQK" role="2OqNvi">
                <node concept="chp4Y" id="6yWW51XPeNN" role="cj9EA">
                  <ref role="cht4Q" to="pvmi:6yWW51XOe8n" resolve="RepresentationInterface" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

