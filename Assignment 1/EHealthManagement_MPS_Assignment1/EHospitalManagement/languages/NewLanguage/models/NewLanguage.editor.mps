<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:532e02a5-0bd8-4390-adcd-a48323f88271(NewLanguage.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="14" />
    <use id="aee9cad2-acd4-4608-aef2-0004f6a1cdbd" name="jetbrains.mps.lang.actions" version="4" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="pvmi" ref="r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1140524381322" name="jetbrains.mps.lang.editor.structure.CellModel_ListWithRole" flags="ng" index="2czfm3">
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
        <child id="1140524464359" name="emptyCellModel" index="2czzBI" />
      </concept>
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1237307900041" name="jetbrains.mps.lang.editor.structure.IndentLayoutIndentStyleClassItem" flags="ln" index="lj46D" />
      <concept id="1237308012275" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem" flags="ln" index="ljvvj" />
      <concept id="1237375020029" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineChildrenStyleClassItem" flags="ln" index="pj6Ft" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
      </concept>
      <concept id="1233758997495" name="jetbrains.mps.lang.editor.structure.PunctuationLeftStyleClassItem" flags="ln" index="11L4FC" />
      <concept id="1233759184865" name="jetbrains.mps.lang.editor.structure.PunctuationRightStyleClassItem" flags="ln" index="11LMrY" />
      <concept id="1088013125922" name="jetbrains.mps.lang.editor.structure.CellModel_RefCell" flags="sg" stub="730538219795941030" index="1iCGBv">
        <child id="1088186146602" name="editorComponent" index="1sWHZn" />
      </concept>
      <concept id="1236262245656" name="jetbrains.mps.lang.editor.structure.MatchingLabelStyleClassItem" flags="ln" index="3mYdg7">
        <property id="1238091709220" name="labelName" index="1413C4" />
      </concept>
      <concept id="1088185857835" name="jetbrains.mps.lang.editor.structure.InlineEditorComponent" flags="ig" index="1sVBvm" />
      <concept id="1139744628335" name="jetbrains.mps.lang.editor.structure.CellModel_Image" flags="sg" stub="8104358048506731195" index="1u4HXA" />
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ng" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073390211982" name="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList" flags="sg" stub="2794558372793454595" index="3F2HdR" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="6yWW51XPYZk">
    <property role="3GE5qa" value="Application Component.All Communication.PrimitiveCommunication.Protocols" />
    <ref role="1XX52x" to="pvmi:6yWW51XMxBp" resolve="MassageExchangeStandard" />
    <node concept="3EZMnI" id="6yWW51XPZ0A" role="2wV5jI">
      <node concept="l2Vlx" id="6yWW51XPZ0B" role="2iSdaV" />
      <node concept="3F0ifn" id="6yWW51XPZ0C" role="3EZMnx">
        <property role="3F0ifm" value="massage exchange standard" />
      </node>
      <node concept="3F0A7n" id="6yWW51XPZ0D" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="6yWW51XPZ0E" role="3EZMnx">
        <property role="3F0ifm" value="(" />
        <node concept="11L4FC" id="6yWW51XPZ0F" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="6yWW51XPZ0G" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
        <node concept="11LMrY" id="6yWW51XPZ0H" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="6yWW51XPZ0I" role="3EZMnx">
        <property role="3F0ifm" value=")" />
        <node concept="11L4FC" id="6yWW51XPZ0J" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="6yWW51XPZ0K" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6yWW51XPZnU">
    <property role="3GE5qa" value="Application Component.All Communication.PrimitiveCommunication.Protocols" />
    <ref role="1XX52x" to="pvmi:6yWW51XMy6Y" resolve="EventMassageType" />
    <node concept="3EZMnI" id="6yWW51XPZou" role="2wV5jI">
      <node concept="l2Vlx" id="6yWW51XPZov" role="2iSdaV" />
      <node concept="3F0ifn" id="6yWW51XPZow" role="3EZMnx">
        <property role="3F0ifm" value="event massage type" />
      </node>
      <node concept="3F0A7n" id="6yWW51XPZox" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="6yWW51XPZoy" role="3EZMnx">
        <property role="3F0ifm" value="message exchange standard" />
      </node>
      <node concept="1iCGBv" id="6yWW51XPZoz" role="3EZMnx">
        <ref role="1NtTu8" to="pvmi:6yWW51XUlzx" resolve="messageExchangeStandard" />
        <node concept="1sVBvm" id="6yWW51XPZoA" role="1sWHZn">
          <node concept="3F0A7n" id="6yWW51XPZoC" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="6yWW51XPZoD" role="3EZMnx">
        <property role="3F0ifm" value=";" />
        <node concept="11L4FC" id="6yWW51XPZoE" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6yWW51XQ1Yd">
    <property role="3GE5qa" value="Application Component.All Communication.SystemtoUserCom" />
    <ref role="1XX52x" to="pvmi:6yWW51XOPF9" resolve="ImageUI" />
    <node concept="3EZMnI" id="6yWW51XQ1Yf" role="2wV5jI">
      <node concept="l2Vlx" id="6yWW51XQ1Yg" role="2iSdaV" />
      <node concept="3F0ifn" id="6yWW51XQ1Yh" role="3EZMnx">
        <property role="3F0ifm" value="image UI" />
      </node>
      <node concept="3F0A7n" id="6yWW51XQ1Yi" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="6yWW51XQ1Yj" role="3EZMnx">
        <property role="3F0ifm" value="(" />
        <node concept="11L4FC" id="6yWW51XQ1Yk" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="6yWW51XQ1Yl" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
        <node concept="11LMrY" id="6yWW51XQ1Ym" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="6yWW51XQ1Yn" role="3EZMnx">
        <property role="3F0ifm" value=")" />
        <node concept="11L4FC" id="6yWW51XQ1Yo" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="6yWW51XQ1Yp" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6yWW51XQ2mR">
    <property role="3GE5qa" value="Application Component.All Communication.SystemtoUserCom" />
    <ref role="1XX52x" to="pvmi:6yWW51XOe8n" resolve="RepresentationInterface" />
    <node concept="3EZMnI" id="6yWW51XQ2mT" role="2wV5jI">
      <node concept="l2Vlx" id="6yWW51XQ2mU" role="2iSdaV" />
      <node concept="3F0ifn" id="6yWW51XQ2mV" role="3EZMnx">
        <property role="3F0ifm" value="representation interface" />
      </node>
      <node concept="3F0A7n" id="6yWW51XQ2mW" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0A7n" id="6yWW51XRowN" role="3EZMnx">
        <ref role="1NtTu8" to="pvmi:6yWW51XQpf9" resolve="type" />
        <node concept="ljvvj" id="6yWW51XTCQe" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="6yWW51XQ2n0" role="3EZMnx">
        <node concept="l2Vlx" id="6yWW51XQ2n1" role="2iSdaV" />
        <node concept="lj46D" id="6yWW51XQ2n2" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQ2n3" role="3EZMnx">
          <property role="3F0ifm" value="image UI" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQ2n4" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51XQ2n5" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQ2n6" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6yWW51XQ2n7" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51XOLtG" resolve="imageUI" />
          <node concept="l2Vlx" id="6yWW51XQ2n8" role="2czzBx" />
          <node concept="pj6Ft" id="6yWW51XQ2n9" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6yWW51XQ2na" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQ2nb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="1u4HXA" id="6yWW51XRVuC" role="2czzBI" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQ2nc" role="3EZMnx">
          <property role="3F0ifm" value="and" />
          <node concept="ljvvj" id="6yWW51XQ2nd" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XQ2ne" role="3EZMnx">
          <property role="3F0ifm" value="text UI" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQ2nf" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51XQ2ng" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQ2nh" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6yWW51XQ2ni" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51XOUhl" resolve="textUI" />
          <node concept="l2Vlx" id="6yWW51XQ2nj" role="2czzBx" />
          <node concept="pj6Ft" id="6yWW51XQ2nk" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6yWW51XQ2nl" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQ2nm" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="3F0ifn" id="6yWW51XRVuE" role="2czzBI" />
        </node>
        <node concept="ljvvj" id="6yWW51XSvwp" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="6yWW51XQ2nn" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="6yWW51XQ2no" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6yWW51XQ2Lw">
    <property role="3GE5qa" value="Application Component.All Communication.SystemtoUserCom" />
    <ref role="1XX52x" to="pvmi:6yWW51XOSZa" resolve="TextUI" />
    <node concept="3EZMnI" id="6yWW51XQ2Ly" role="2wV5jI">
      <node concept="l2Vlx" id="6yWW51XQ2Lz" role="2iSdaV" />
      <node concept="3F0ifn" id="6yWW51XQ2L$" role="3EZMnx">
        <property role="3F0ifm" value="text UI" />
      </node>
      <node concept="3F0A7n" id="6yWW51XQ2L_" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="6yWW51XQ2LA" role="3EZMnx">
        <property role="3F0ifm" value="(" />
        <node concept="11L4FC" id="6yWW51XQ2LB" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="6yWW51XQ2LC" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
        <node concept="11LMrY" id="6yWW51XQ2LD" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="6yWW51XQ2LE" role="3EZMnx">
        <property role="3F0ifm" value=")" />
        <node concept="11L4FC" id="6yWW51XQ2LF" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="6yWW51XQ2LG" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6yWW51XQ3bu">
    <property role="3GE5qa" value="Application Component.All Communication.UsertoSystemCom" />
    <ref role="1XX52x" to="pvmi:6yWW51XOek_" resolve="DatasetType" />
    <node concept="3EZMnI" id="6yWW51XQ3_W" role="2wV5jI">
      <node concept="l2Vlx" id="6yWW51XQ3_X" role="2iSdaV" />
      <node concept="3F0ifn" id="6yWW51XQ3_Y" role="3EZMnx">
        <property role="3F0ifm" value="dataset type" />
      </node>
      <node concept="3F0A7n" id="6yWW51XQ3_Z" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="6yWW51XQ3A0" role="3EZMnx">
        <property role="3F0ifm" value="(" />
        <node concept="11L4FC" id="6yWW51XQ3A1" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="6yWW51XQ3A2" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
        <node concept="11LMrY" id="6yWW51XQ3A3" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="6yWW51XQ3A4" role="3EZMnx">
        <property role="3F0ifm" value=")" />
        <node concept="11L4FC" id="6yWW51XQ3A5" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="6yWW51XQ3A6" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6yWW51XQ63T">
    <property role="3GE5qa" value="Application Component.All Communication.UsertoUserCom.MassageType" />
    <ref role="1XX52x" to="pvmi:6yWW51XOqWx" resolve="FileMessage" />
    <node concept="3EZMnI" id="6yWW51XQ63V" role="2wV5jI">
      <node concept="l2Vlx" id="6yWW51XQ63W" role="2iSdaV" />
      <node concept="3F0ifn" id="6yWW51XQ63X" role="3EZMnx">
        <property role="3F0ifm" value="file message" />
      </node>
      <node concept="3F0A7n" id="6yWW51XQ63Y" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="6yWW51XQ63Z" role="3EZMnx">
        <property role="3F0ifm" value="(" />
        <node concept="11L4FC" id="6yWW51XQ640" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="6yWW51XQ641" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
        <node concept="11LMrY" id="6yWW51XQ642" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="6yWW51XQ643" role="3EZMnx">
        <property role="3F0ifm" value=")" />
        <node concept="11L4FC" id="6yWW51XQ644" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="6yWW51XQ645" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6yWW51XQ7kZ">
    <property role="3GE5qa" value="Application Component.All Communication.UsertoUserCom.MassageType" />
    <ref role="1XX52x" to="pvmi:6yWW51XOqh9" resolve="ImageMessage" />
    <node concept="3EZMnI" id="6yWW51XQ7l1" role="2wV5jI">
      <node concept="l2Vlx" id="6yWW51XQ7l2" role="2iSdaV" />
      <node concept="3F0ifn" id="6yWW51XQ7l3" role="3EZMnx">
        <property role="3F0ifm" value="image message" />
      </node>
      <node concept="3F0A7n" id="6yWW51XQ7l4" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="6yWW51XQ7l5" role="3EZMnx">
        <property role="3F0ifm" value="(" />
        <node concept="11L4FC" id="6yWW51XQ7l6" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="6yWW51XQ7l7" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
        <node concept="11LMrY" id="6yWW51XQ7l8" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="6yWW51XQ7l9" role="3EZMnx">
        <property role="3F0ifm" value=")" />
        <node concept="11L4FC" id="6yWW51XQ7la" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="6yWW51XQ7lb" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6yWW51XQ7KV">
    <property role="3GE5qa" value="Application Component.All Communication.UsertoUserCom.MassageType" />
    <ref role="1XX52x" to="pvmi:6yWW51XOoKB" resolve="TextMessage" />
    <node concept="3EZMnI" id="6yWW51XQ7KX" role="2wV5jI">
      <node concept="l2Vlx" id="6yWW51XQ7KY" role="2iSdaV" />
      <node concept="3F0ifn" id="6yWW51XQ7KZ" role="3EZMnx">
        <property role="3F0ifm" value="text message" />
      </node>
      <node concept="3F0A7n" id="6yWW51XQ7L0" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="6yWW51XQ7L1" role="3EZMnx">
        <property role="3F0ifm" value="(" />
        <node concept="11L4FC" id="6yWW51XQ7L2" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="6yWW51XQ7L3" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
        <node concept="11LMrY" id="6yWW51XQ7L4" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="6yWW51XQ7L5" role="3EZMnx">
        <property role="3F0ifm" value=")" />
        <node concept="11L4FC" id="6yWW51XQ7L6" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="6yWW51XQ7L7" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6yWW51XQ8dC">
    <property role="3GE5qa" value="Application Component.All Communication.UsertoUserCom" />
    <ref role="1XX52x" to="pvmi:6yWW51XMAB1" resolve="CommunicationInterface" />
    <node concept="3EZMnI" id="6yWW51XQ8dE" role="2wV5jI">
      <node concept="l2Vlx" id="6yWW51XQ8dF" role="2iSdaV" />
      <node concept="3F0ifn" id="6yWW51XQ8dG" role="3EZMnx">
        <property role="3F0ifm" value="communication interface" />
      </node>
      <node concept="3F0A7n" id="6yWW51XQ8dH" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="6yWW51XQ8dI" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="6yWW51XQ8dJ" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="6yWW51XQ8dK" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="6yWW51XQ8dL" role="3EZMnx">
        <node concept="l2Vlx" id="6yWW51XQ8dM" role="2iSdaV" />
        <node concept="lj46D" id="6yWW51XQ8dN" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQ8dO" role="3EZMnx">
          <property role="3F0ifm" value="document type" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQ8dP" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51XQ8dQ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQ8dR" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6yWW51XQ8dS" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51XOLeY" resolve="documentType" />
          <node concept="l2Vlx" id="6yWW51XQ8dT" role="2czzBx" />
          <node concept="pj6Ft" id="6yWW51XQ8dU" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6yWW51XQ8dV" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQ8dW" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XQ8dX" role="3EZMnx">
          <node concept="ljvvj" id="6yWW51XQ8dY" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XQ8dZ" role="3EZMnx">
          <property role="3F0ifm" value="message type" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQ8e0" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51XQ8e1" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQ8e2" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6yWW51XQ8e3" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51XOLf3" resolve="messageType" />
          <node concept="l2Vlx" id="6yWW51XQ8e4" role="2czzBx" />
          <node concept="pj6Ft" id="6yWW51XQ8e5" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6yWW51XQ8e6" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQ8e7" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XQ8e8" role="3EZMnx">
          <node concept="ljvvj" id="6yWW51XQ8e9" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XQ8ea" role="3EZMnx">
          <property role="3F0ifm" value="dataset type" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQ8eb" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51XQ8ec" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQ8ed" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6yWW51XQ8ee" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51XOVNU" resolve="datasetType" />
          <node concept="l2Vlx" id="6yWW51XQ8ef" role="2czzBx" />
          <node concept="pj6Ft" id="6yWW51XQ8eg" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6yWW51XQ8eh" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQ8ei" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="6yWW51XQ8ej" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="6yWW51XQ8ek" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6yWW51XQ8FZ">
    <property role="3GE5qa" value="Application Component.All Communication.UsertoUserCom" />
    <ref role="1XX52x" to="pvmi:6yWW51XOgyz" resolve="DocumentType" />
    <node concept="3EZMnI" id="6yWW51XQ8G1" role="2wV5jI">
      <node concept="l2Vlx" id="6yWW51XQ8G2" role="2iSdaV" />
      <node concept="3F0ifn" id="6yWW51XQ8G3" role="3EZMnx">
        <property role="3F0ifm" value="document type" />
      </node>
      <node concept="3F0A7n" id="6yWW51XQ8G4" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="6yWW51XQ8G5" role="3EZMnx">
        <property role="3F0ifm" value="event message type" />
      </node>
      <node concept="1iCGBv" id="6yWW51XQ8G6" role="3EZMnx">
        <ref role="1NtTu8" to="pvmi:6yWW51XPsSm" resolve="eventMessageType" />
        <node concept="1sVBvm" id="6yWW51XQ8G9" role="1sWHZn">
          <node concept="3F0A7n" id="6yWW51XQ8Gb" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6yWW51XQb4d">
    <property role="3GE5qa" value="Application Component.All Communication.UsertoUserCom" />
    <ref role="1XX52x" to="pvmi:6yWW51XOgJJ" resolve="MessageType" />
    <node concept="3EZMnI" id="6yWW51XQb4f" role="2wV5jI">
      <node concept="l2Vlx" id="6yWW51XQb4g" role="2iSdaV" />
      <node concept="3F0ifn" id="6yWW51XQb4h" role="3EZMnx">
        <property role="3F0ifm" value="message type" />
      </node>
      <node concept="3F0A7n" id="6yWW51XQb4i" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="6yWW51XQb4j" role="3EZMnx">
        <property role="3F0ifm" value="event message type" />
      </node>
      <node concept="1iCGBv" id="6yWW51XQb4k" role="3EZMnx">
        <ref role="1NtTu8" to="pvmi:6yWW51XOgX_" resolve="eventMessageType" />
        <node concept="1sVBvm" id="6yWW51XQb4n" role="1sWHZn">
          <node concept="3F0A7n" id="6yWW51XQb4p" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:hnGE5uv" resolve="virtualPackage" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="6yWW51XQb4q" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="6yWW51XQb4r" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="6yWW51XQb4s" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="6yWW51XQb4t" role="3EZMnx">
        <node concept="l2Vlx" id="6yWW51XQb4u" role="2iSdaV" />
        <node concept="lj46D" id="6yWW51XQb4v" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQb4w" role="3EZMnx">
          <property role="3F0ifm" value="file message" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQb4x" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51XQb4y" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQb4z" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6yWW51XQb4$" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51XQb3u" resolve="fileMessage" />
          <node concept="l2Vlx" id="6yWW51XQb4_" role="2czzBx" />
          <node concept="pj6Ft" id="6yWW51XQb4A" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6yWW51XQb4B" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQb4C" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XQb4D" role="3EZMnx">
          <node concept="ljvvj" id="6yWW51XQb4E" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XQb4F" role="3EZMnx">
          <property role="3F0ifm" value="image message" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQb4G" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51XQb4H" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQb4I" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6yWW51XQb4J" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51XQb3z" resolve="imageMessage" />
          <node concept="l2Vlx" id="6yWW51XQb4K" role="2czzBx" />
          <node concept="pj6Ft" id="6yWW51XQb4L" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6yWW51XQb4M" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQb4N" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XQb4O" role="3EZMnx">
          <node concept="ljvvj" id="6yWW51XQb4P" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XQb4Q" role="3EZMnx">
          <property role="3F0ifm" value="text message" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQb4R" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51XQb4S" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQb4T" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6yWW51XQb4U" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51XQb3E" resolve="textMessage" />
          <node concept="l2Vlx" id="6yWW51XQb4V" role="2czzBx" />
          <node concept="pj6Ft" id="6yWW51XQb4W" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6yWW51XQb4X" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQb4Y" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="6yWW51XQb4Z" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="6yWW51XQb50" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6yWW51XQcy6">
    <property role="3GE5qa" value="Application Component" />
    <ref role="1XX52x" to="pvmi:6yWW51XMMAK" resolve="UserInterface" />
    <node concept="3EZMnI" id="6yWW51XQcy8" role="2wV5jI">
      <node concept="l2Vlx" id="6yWW51XQcy9" role="2iSdaV" />
      <node concept="3F0ifn" id="6yWW51XQcya" role="3EZMnx">
        <property role="3F0ifm" value="user interface" />
      </node>
      <node concept="3F0A7n" id="6yWW51XQcyb" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="6yWW51XQcyc" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="6yWW51XQcyd" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="6yWW51XQcye" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="6yWW51XQcyf" role="3EZMnx">
        <node concept="l2Vlx" id="6yWW51XQcyg" role="2iSdaV" />
        <node concept="lj46D" id="6yWW51XQcyh" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQcyi" role="3EZMnx">
          <property role="3F0ifm" value="representation interface" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQcyj" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51XQcyk" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQcyl" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6yWW51XQcym" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51XOozs" resolve="representationInterface" />
          <node concept="l2Vlx" id="6yWW51XQcyn" role="2czzBx" />
          <node concept="pj6Ft" id="6yWW51XQcyo" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6yWW51XQcyp" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQcyq" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XQcyr" role="3EZMnx">
          <node concept="ljvvj" id="6yWW51XQcys" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XQcyt" role="3EZMnx">
          <property role="3F0ifm" value="communication interface" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQcyu" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51XQcyv" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQcyw" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6yWW51XQcyx" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51XOU0Q" resolve="communicationInterface" />
          <node concept="l2Vlx" id="6yWW51XQcyy" role="2czzBx" />
          <node concept="pj6Ft" id="6yWW51XQcyz" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6yWW51XQcy$" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQcy_" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XQcyA" role="3EZMnx">
          <node concept="ljvvj" id="6yWW51XQcyB" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XQcyC" role="3EZMnx">
          <property role="3F0ifm" value="document type" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQcyD" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51XQcyE" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQcyF" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6yWW51XQcyG" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51XOLeY" resolve="documentType" />
          <node concept="l2Vlx" id="6yWW51XQcyH" role="2czzBx" />
          <node concept="pj6Ft" id="6yWW51XQcyI" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6yWW51XQcyJ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQcyK" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XQcyL" role="3EZMnx">
          <node concept="ljvvj" id="6yWW51XQcyM" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XQcyN" role="3EZMnx">
          <property role="3F0ifm" value="message type" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQcyO" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51XQcyP" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQcyQ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6yWW51XQcyR" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51XOLf3" resolve="messageType" />
          <node concept="l2Vlx" id="6yWW51XQcyS" role="2czzBx" />
          <node concept="pj6Ft" id="6yWW51XQcyT" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6yWW51XQcyU" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQcyV" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XQcyW" role="3EZMnx">
          <node concept="ljvvj" id="6yWW51XQcyX" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XQcyY" role="3EZMnx">
          <property role="3F0ifm" value="dataset type" />
        </node>
        <node concept="3F0ifn" id="6yWW51XQcyZ" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51XQcz0" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQcz1" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6yWW51XQcz2" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51XOVNU" resolve="datasetType" />
          <node concept="l2Vlx" id="6yWW51XQcz3" role="2czzBx" />
          <node concept="pj6Ft" id="6yWW51XQcz4" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6yWW51XQcz5" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XQcz6" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="6yWW51XQcz7" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="6yWW51XQcz8" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6yWW51XRgxm">
    <property role="3GE5qa" value="Application Component" />
    <ref role="1XX52x" to="pvmi:6yWW51XMv91" resolve="User" />
    <node concept="3EZMnI" id="6yWW51XRgxo" role="2wV5jI">
      <node concept="l2Vlx" id="6yWW51XRgxp" role="2iSdaV" />
      <node concept="3F0ifn" id="6yWW51XRgxq" role="3EZMnx">
        <property role="3F0ifm" value="user" />
      </node>
      <node concept="3F0A7n" id="6yWW51XRgxr" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="6yWW51XRgxs" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="6yWW51XRgxt" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="6yWW51XRgxu" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="6yWW51XRgxv" role="3EZMnx">
        <node concept="l2Vlx" id="6yWW51XRgxw" role="2iSdaV" />
        <node concept="lj46D" id="6yWW51XRgxx" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="6yWW51XRgxy" role="3EZMnx">
          <property role="3F0ifm" value="type" />
        </node>
        <node concept="3F0ifn" id="6yWW51XRgxz" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51XRgx$" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6yWW51XRgx_" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51XMvfC" resolve="type" />
          <node concept="ljvvj" id="6yWW51XRgxA" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XRgxB" role="3EZMnx">
          <node concept="ljvvj" id="6yWW51XRgxC" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6yWW51XRgxD" role="3EZMnx">
          <property role="3F0ifm" value="user interface" />
        </node>
        <node concept="3F0ifn" id="6yWW51XRgxE" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51XRgxF" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XRgxG" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6yWW51XRgxH" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51XOjzz" resolve="userInterface" />
          <node concept="l2Vlx" id="6yWW51XRgxI" role="2czzBx" />
          <node concept="pj6Ft" id="6yWW51XRgxJ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6yWW51XRgxK" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51XRgxL" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="6yWW51XRgxM" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="6yWW51XRgxN" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6yWW51Y0tUt">
    <property role="3GE5qa" value="Application Component.All Communication.PrimitiveCommunication" />
    <ref role="1XX52x" to="pvmi:6yWW51XMf01" resolve="Datatype" />
    <node concept="3EZMnI" id="6yWW51Y0tUv" role="2wV5jI">
      <node concept="l2Vlx" id="6yWW51Y0tUw" role="2iSdaV" />
      <node concept="3F0ifn" id="6yWW51Y0tUx" role="3EZMnx">
        <property role="3F0ifm" value="datatype" />
      </node>
      <node concept="3F0A7n" id="6yWW51Y0tUy" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="6yWW51Y0tUz" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="6yWW51Y0tU$" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="6yWW51Y0tU_" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="6yWW51Y0tUA" role="3EZMnx">
        <node concept="l2Vlx" id="6yWW51Y0tUB" role="2iSdaV" />
        <node concept="lj46D" id="6yWW51Y0tUC" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="6yWW51Y0tUD" role="3EZMnx">
          <property role="3F0ifm" value="entities" />
        </node>
        <node concept="3F0ifn" id="6yWW51Y0tUE" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51Y0tUF" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51Y0tUG" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6yWW51Y0tUH" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51XMf0S" resolve="entities" />
          <node concept="l2Vlx" id="6yWW51Y0tUI" role="2czzBx" />
          <node concept="pj6Ft" id="6yWW51Y0tUJ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6yWW51Y0tUK" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51Y0tUL" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="6yWW51Y0tUM" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="6yWW51Y0tUN" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6yWW51Y0umH">
    <property role="3GE5qa" value="Application Component.All Communication.PrimitiveCommunication" />
    <ref role="1XX52x" to="pvmi:6yWW51XMf6m" resolve="Entity" />
    <node concept="3EZMnI" id="6yWW51Y0umJ" role="2wV5jI">
      <node concept="l2Vlx" id="6yWW51Y0umK" role="2iSdaV" />
      <node concept="3F0ifn" id="6yWW51Y0umL" role="3EZMnx">
        <property role="3F0ifm" value="entity" />
      </node>
      <node concept="3F0A7n" id="6yWW51Y0umM" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="6yWW51Y0umN" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="6yWW51Y0umO" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="6yWW51Y0umP" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="6yWW51Y0umQ" role="3EZMnx">
        <node concept="l2Vlx" id="6yWW51Y0umR" role="2iSdaV" />
        <node concept="lj46D" id="6yWW51Y0umS" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="6yWW51Y0umT" role="3EZMnx">
          <property role="3F0ifm" value="atributes" />
        </node>
        <node concept="3F0ifn" id="6yWW51Y0umU" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51Y0umV" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51Y0umW" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6yWW51Y0umX" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51XMm2l" resolve="atributes" />
          <node concept="l2Vlx" id="6yWW51Y0umY" role="2czzBx" />
          <node concept="pj6Ft" id="6yWW51Y0umZ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6yWW51Y0un0" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="6yWW51Y0un1" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="6yWW51Y0un2" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="6yWW51Y0un3" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6yWW51Y0UVn">
    <property role="3GE5qa" value="Application Component.All Communication.PrimitiveCommunication" />
    <ref role="1XX52x" to="pvmi:6yWW51Y0id6" resolve="Attributes" />
    <node concept="3EZMnI" id="6yWW51Y0UVp" role="2wV5jI">
      <node concept="l2Vlx" id="6yWW51Y0UVq" role="2iSdaV" />
      <node concept="3F0ifn" id="6yWW51Y0UVr" role="3EZMnx">
        <property role="3F0ifm" value="attribute" />
      </node>
      <node concept="3F0A7n" id="6yWW51Y0UVs" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="6yWW51Y0UVt" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="6yWW51Y0UVu" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="6yWW51Y0UVv" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="6yWW51Y0UVw" role="3EZMnx">
        <node concept="l2Vlx" id="6yWW51Y0UVx" role="2iSdaV" />
        <node concept="lj46D" id="6yWW51Y0UVy" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="6yWW51Y0UVz" role="3EZMnx">
          <property role="3F0ifm" value="type" />
        </node>
        <node concept="3F0ifn" id="6yWW51Y0UV$" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6yWW51Y0UV_" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6yWW51Y0UVA" role="3EZMnx">
          <ref role="1NtTu8" to="pvmi:6yWW51Y0iFm" resolve="type" />
          <node concept="ljvvj" id="6yWW51Y0UVB" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="6yWW51Y0UVC" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="6yWW51Y0UVD" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
</model>

