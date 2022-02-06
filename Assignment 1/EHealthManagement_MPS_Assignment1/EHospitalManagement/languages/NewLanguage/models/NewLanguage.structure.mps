<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)">
  <persistence version="9" />
  <languages>
    <use id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure" version="9" />
    <use id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel" version="19" />
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="3348158742936976480" name="jetbrains.mps.lang.structure.structure.EnumerationMemberDeclaration" flags="ng" index="25R33">
        <property id="1421157252384165432" name="memberId" index="3tVfz5" />
      </concept>
      <concept id="3348158742936976479" name="jetbrains.mps.lang.structure.structure.EnumerationDeclaration" flags="ng" index="25R3W">
        <child id="3348158742936976577" name="members" index="25R1y" />
      </concept>
      <concept id="1082978164218" name="jetbrains.mps.lang.structure.structure.DataTypeDeclaration" flags="ng" index="AxPO6">
        <property id="7791109065626895363" name="datatypeId" index="3F6X1D" />
      </concept>
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <property id="5092175715804935370" name="conceptAlias" index="34LRSv" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <property id="241647608299431129" name="propertyId" index="IQ2nx" />
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="6yWW51XMf6m">
    <property role="EcuMT" value="7547171304064479638" />
    <property role="TrG5h" value="Entity" />
    <property role="3GE5qa" value="Application Component.All Communication.PrimitiveCommunication" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="6yWW51XMf6n" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="6yWW51XMm2l" role="1TKVEi">
      <property role="IQ2ns" value="7547171304064508053" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="atributes" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="6yWW51Y0id6" resolve="Attributes" />
    </node>
  </node>
  <node concept="25R3W" id="6yWW51XMm27">
    <property role="3F6X1D" value="7547171304064508039" />
    <property role="TrG5h" value="AllowedDatatypes" />
    <property role="3GE5qa" value="Application Component.All Communication.PrimitiveCommunication" />
    <node concept="25R33" id="6yWW51XMm28" role="25R1y">
      <property role="3tVfz5" value="7547171304064508040" />
      <property role="TrG5h" value="INTEGER" />
    </node>
    <node concept="25R33" id="6yWW51XMm29" role="25R1y">
      <property role="3tVfz5" value="7547171304064508041" />
      <property role="TrG5h" value="STRING" />
    </node>
    <node concept="25R33" id="6yWW51XMm2c" role="25R1y">
      <property role="3tVfz5" value="7547171304064508044" />
      <property role="TrG5h" value="BOOLEAN" />
    </node>
    <node concept="25R33" id="6yWW51XMm2g" role="25R1y">
      <property role="3tVfz5" value="7547171304064508048" />
      <property role="TrG5h" value="VARCHAR" />
    </node>
    <node concept="25R33" id="6yWW51XMu2Z" role="25R1y">
      <property role="3tVfz5" value="7547171304064540863" />
      <property role="TrG5h" value="DATE" />
    </node>
    <node concept="25R33" id="6yWW51XOOsI" role="25R1y">
      <property role="3tVfz5" value="7547171304065156910" />
      <property role="TrG5h" value="IMAGE" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XMf01">
    <property role="EcuMT" value="7547171304064479233" />
    <property role="TrG5h" value="Datatype" />
    <property role="19KtqR" value="true" />
    <property role="3GE5qa" value="Application Component.All Communication.PrimitiveCommunication" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="6yWW51XMf0Q" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="6yWW51XMf0S" role="1TKVEi">
      <property role="IQ2ns" value="7547171304064479288" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="entities" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="6yWW51XMf6m" resolve="Entity" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XMrYP">
    <property role="EcuMT" value="7547171304064532405" />
    <property role="3GE5qa" value="Application Component.All Communication.PrimitiveCommunication.TypesofData" />
    <property role="TrG5h" value="String" />
    <property role="34LRSv" value="str" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="6yWW51XMs2M" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="6yWW51XMt1S" role="1TKVEl">
      <property role="IQ2nx" value="7547171304064536696" />
      <property role="TrG5h" value="size" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XMtPa">
    <property role="EcuMT" value="7547171304064539978" />
    <property role="3GE5qa" value="Application Component.All Communication.PrimitiveCommunication.TypesofData" />
    <property role="TrG5h" value="Boolean" />
    <property role="34LRSv" value="bool" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="6yWW51XMtTL" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="6yWW51XMult" role="1TKVEl">
      <property role="IQ2nx" value="7547171304064542045" />
      <property role="TrG5h" value="size" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XMuq5">
    <property role="EcuMT" value="7547171304064542341" />
    <property role="3GE5qa" value="Application Component.All Communication.PrimitiveCommunication.TypesofData" />
    <property role="TrG5h" value="Varchar" />
    <property role="34LRSv" value="var" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="6yWW51XMuvm" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="6yWW51XMuvo" role="1TKVEl">
      <property role="IQ2nx" value="7547171304064542680" />
      <property role="TrG5h" value="size" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XMuvq">
    <property role="EcuMT" value="7547171304064542682" />
    <property role="3GE5qa" value="Application Component.All Communication.PrimitiveCommunication.TypesofData" />
    <property role="TrG5h" value="Date" />
    <property role="34LRSv" value="date" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="6yWW51XMu_l" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="6yWW51XMu_n" role="1TKVEl">
      <property role="IQ2nx" value="7547171304064543063" />
      <property role="TrG5h" value="size" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XMv91">
    <property role="EcuMT" value="7547171304064545345" />
    <property role="TrG5h" value="User" />
    <property role="34LRSv" value="Utype" />
    <property role="19KtqR" value="true" />
    <property role="3GE5qa" value="Application Component" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="1TJgyi" id="6yWW51XMvfC" role="1TKVEl">
      <property role="IQ2nx" value="7547171304064545768" />
      <property role="TrG5h" value="type" />
      <ref role="AX2Wp" node="6yWW51XMvfE" resolve="AllowedUsertypes" />
    </node>
    <node concept="PrWs8" id="6yWW51XMAlV" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="6yWW51XOjzz" role="1TKVEi">
      <property role="IQ2ns" value="7547171304065022179" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="userInterface" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="6yWW51XMMAK" resolve="UserInterface" />
    </node>
  </node>
  <node concept="25R3W" id="6yWW51XMvfE">
    <property role="3F6X1D" value="7547171304064545770" />
    <property role="3GE5qa" value="Application Component" />
    <property role="TrG5h" value="AllowedUsertypes" />
    <node concept="25R33" id="6yWW51XMvfF" role="25R1y">
      <property role="3tVfz5" value="7547171304064545771" />
      <property role="TrG5h" value="Doctor" />
    </node>
    <node concept="25R33" id="6yWW51XMvmU" role="25R1y">
      <property role="3tVfz5" value="7547171304064546234" />
      <property role="TrG5h" value="Patient" />
    </node>
    <node concept="25R33" id="6yWW51XMvmX" role="25R1y">
      <property role="3tVfz5" value="7547171304064546237" />
      <property role="TrG5h" value="SystemAdmin" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XMxBp">
    <property role="EcuMT" value="7547171304064555481" />
    <property role="3GE5qa" value="Application Component.All Communication.PrimitiveCommunication.Protocols" />
    <property role="TrG5h" value="MassageExchangeStandard" />
    <property role="34LRSv" value="MES" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="6yWW51XMxJi" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XMy6Y">
    <property role="EcuMT" value="7547171304064557502" />
    <property role="3GE5qa" value="Application Component.All Communication.PrimitiveCommunication.Protocols" />
    <property role="TrG5h" value="EventMassageType" />
    <property role="34LRSv" value="EMT" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="6yWW51XMCh_" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="6yWW51XUlzx" role="1TKVEi">
      <property role="IQ2ns" value="7547171304066603233" />
      <property role="20kJfa" value="messageExchangeStandard" />
      <ref role="20lvS9" node="6yWW51XMxBp" resolve="MassageExchangeStandard" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XMAB1">
    <property role="EcuMT" value="7547171304064575937" />
    <property role="3GE5qa" value="Application Component.All Communication.UsertoUserCom" />
    <property role="TrG5h" value="CommunicationInterface" />
    <property role="34LRSv" value="CI" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="6yWW51XMWZx" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="6yWW51XOLeY" role="1TKVEi">
      <property role="IQ2ns" value="7547171304065143742" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="documentType" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="6yWW51XOgyz" resolve="DocumentType" />
    </node>
    <node concept="1TJgyj" id="6yWW51XOLf3" role="1TKVEi">
      <property role="IQ2ns" value="7547171304065143747" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="messageType" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="6yWW51XOgJJ" resolve="MessageType" />
    </node>
    <node concept="1TJgyj" id="6yWW51XOVNU" role="1TKVEi">
      <property role="IQ2ns" value="7547171304065187066" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="datasetType" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="6yWW51XOek_" resolve="DatasetType" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XMMAK">
    <property role="EcuMT" value="7547171304064625072" />
    <property role="3GE5qa" value="Application Component" />
    <property role="TrG5h" value="UserInterface" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" node="6yWW51XMAB1" resolve="CommunicationInterface" />
    <node concept="PrWs8" id="6yWW51XMMLh" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="6yWW51XOozs" role="1TKVEi">
      <property role="IQ2ns" value="7547171304065042652" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="representationInterface" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="6yWW51XOe8n" resolve="RepresentationInterface" />
    </node>
    <node concept="1TJgyj" id="6yWW51XOU0Q" role="1TKVEi">
      <property role="IQ2ns" value="7547171304065179702" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="communicationInterface" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="6yWW51XMAB1" resolve="CommunicationInterface" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XOek_">
    <property role="EcuMT" value="7547171304065000741" />
    <property role="3GE5qa" value="Application Component.All Communication.UsertoSystemCom" />
    <property role="TrG5h" value="DatasetType" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="6yWW51XOex4" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XOgyz">
    <property role="EcuMT" value="7547171304065009827" />
    <property role="3GE5qa" value="Application Component.All Communication.UsertoUserCom" />
    <property role="TrG5h" value="DocumentType" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="6yWW51XOgJG" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="6yWW51XPsSm" role="1TKVEi">
      <property role="IQ2ns" value="7547171304065322518" />
      <property role="20kJfa" value="eventMessageType" />
      <ref role="20lvS9" node="6yWW51XMy6Y" resolve="EventMassageType" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XOgJJ">
    <property role="EcuMT" value="7547171304065010671" />
    <property role="3GE5qa" value="Application Component.All Communication.UsertoUserCom" />
    <property role="TrG5h" value="MessageType" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="6yWW51XOgXy" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="6yWW51XOgX_" role="1TKVEi">
      <property role="IQ2ns" value="7547171304065011557" />
      <property role="20kJfa" value="eventMessageType" />
      <ref role="20lvS9" node="6yWW51XMy6Y" resolve="EventMassageType" />
    </node>
    <node concept="1TJgyj" id="6yWW51XQb3u" role="1TKVEi">
      <property role="IQ2ns" value="7547171304065511646" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="fileMessage" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="6yWW51XOqWx" resolve="FileMessage" />
    </node>
    <node concept="1TJgyj" id="6yWW51XQb3z" role="1TKVEi">
      <property role="IQ2ns" value="7547171304065511651" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="imageMessage" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="6yWW51XOqh9" resolve="ImageMessage" />
    </node>
    <node concept="1TJgyj" id="6yWW51XQb3E" role="1TKVEi">
      <property role="IQ2ns" value="7547171304065511658" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="textMessage" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="6yWW51XOoKB" resolve="TextMessage" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XOoKB">
    <property role="EcuMT" value="7547171304065043495" />
    <property role="TrG5h" value="TextMessage" />
    <property role="3GE5qa" value="Application Component.All Communication.UsertoUserCom.MassageType" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="6yWW51XOoYq" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XOqh9">
    <property role="EcuMT" value="7547171304065049673" />
    <property role="3GE5qa" value="Application Component.All Communication.UsertoUserCom.MassageType" />
    <property role="TrG5h" value="ImageMessage" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="6yWW51XOqI2" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XOqWx">
    <property role="EcuMT" value="7547171304065052449" />
    <property role="3GE5qa" value="Application Component.All Communication.UsertoUserCom.MassageType" />
    <property role="TrG5h" value="FileMessage" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="6yWW51XOrbC" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XOe8n">
    <property role="EcuMT" value="7547171304064999959" />
    <property role="TrG5h" value="RepresentationInterface" />
    <property role="3GE5qa" value="Application Component.All Communication.SystemtoUserCom" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="6yWW51XOekc" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="6yWW51XOLtG" role="1TKVEi">
      <property role="IQ2ns" value="7547171304065144684" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="imageUI" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="6yWW51XOPF9" resolve="ImageUI" />
    </node>
    <node concept="1TJgyj" id="6yWW51XOUhl" role="1TKVEi">
      <property role="IQ2ns" value="7547171304065180757" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="textUI" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="6yWW51XOSZa" resolve="TextUI" />
    </node>
    <node concept="1TJgyi" id="6yWW51XQpf9" role="1TKVEl">
      <property role="IQ2nx" value="7547171304065569737" />
      <property role="TrG5h" value="type" />
      <ref role="AX2Wp" node="6yWW51XQpfc" resolve="AllowedPageTypes" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XOPF9">
    <property role="EcuMT" value="7547171304065161929" />
    <property role="TrG5h" value="ImageUI" />
    <property role="3GE5qa" value="Application Component.All Communication.SystemtoUserCom" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="6yWW51XOPV$" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51XOSZa">
    <property role="EcuMT" value="7547171304065175498" />
    <property role="3GE5qa" value="Application Component.All Communication.SystemtoUserCom" />
    <property role="TrG5h" value="TextUI" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="6yWW51XOTf_" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="25R3W" id="6yWW51XQpfc">
    <property role="3F6X1D" value="7547171304065569740" />
    <property role="3GE5qa" value="Application Component.All Communication.SystemtoUserCom" />
    <property role="TrG5h" value="AllowedRepresentationTypes" />
    <node concept="25R33" id="6yWW51XRTrC" role="25R1y">
      <property role="3tVfz5" value="7547171304065963752" />
      <property role="TrG5h" value="PatientList" />
    </node>
    <node concept="25R33" id="6yWW51XRTs6" role="25R1y">
      <property role="3tVfz5" value="7547171304065963782" />
      <property role="TrG5h" value="PatientDetails" />
    </node>
    <node concept="25R33" id="6yWW51XRTsf" role="25R1y">
      <property role="3tVfz5" value="7547171304065963791" />
      <property role="TrG5h" value="ProfilePage" />
    </node>
    <node concept="25R33" id="6yWW51XRTsq" role="25R1y">
      <property role="3tVfz5" value="7547171304065963802" />
      <property role="TrG5h" value="PatientInteraction" />
    </node>
    <node concept="25R33" id="6yWW51XQpJo" role="25R1y">
      <property role="3tVfz5" value="7547171304065571800" />
      <property role="TrG5h" value="Notification" />
    </node>
    <node concept="25R33" id="6yWW51XRTsB" role="25R1y">
      <property role="3tVfz5" value="7547171304065963815" />
      <property role="TrG5h" value="MedicineList" />
    </node>
    <node concept="25R33" id="6yWW51XRTsQ" role="25R1y">
      <property role="3tVfz5" value="7547171304065963830" />
      <property role="TrG5h" value="PatientDocuments" />
    </node>
    <node concept="25R33" id="6yWW51XRTtE" role="25R1y">
      <property role="3tVfz5" value="7547171304065963882" />
      <property role="TrG5h" value="PatientReports" />
    </node>
    <node concept="25R33" id="6yWW51XQpJt" role="25R1y">
      <property role="3tVfz5" value="7547171304065571805" />
      <property role="TrG5h" value="PopUpPage" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51Y0id6">
    <property role="EcuMT" value="7547171304068162374" />
    <property role="3GE5qa" value="Application Component.All Communication.PrimitiveCommunication" />
    <property role="TrG5h" value="Attributes" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="6yWW51Y0iFj" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="6yWW51Y0iFm" role="1TKVEl">
      <property role="IQ2nx" value="7547171304068164310" />
      <property role="TrG5h" value="type" />
      <ref role="AX2Wp" node="6yWW51XMm27" resolve="AllowedDatatypes" />
    </node>
    <node concept="1TJgyj" id="6yWW51Y1$IR" role="1TKVEi">
      <property role="IQ2ns" value="7547171304068500407" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="integer" />
      <ref role="20lvS9" node="6yWW51Y0seL" resolve="Integer" />
    </node>
    <node concept="1TJgyj" id="6yWW51Y2Otc" role="1TKVEi">
      <property role="IQ2ns" value="7547171304068826956" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="string" />
      <ref role="20lvS9" node="6yWW51XMrYP" resolve="String" />
    </node>
    <node concept="1TJgyj" id="6yWW51Y2Oth" role="1TKVEi">
      <property role="IQ2ns" value="7547171304068826961" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="boolean" />
      <ref role="20lvS9" node="6yWW51XMtPa" resolve="Boolean" />
    </node>
    <node concept="1TJgyj" id="6yWW51Y2Oto" role="1TKVEi">
      <property role="IQ2ns" value="7547171304068826968" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="varchar" />
      <ref role="20lvS9" node="6yWW51XMuq5" resolve="Varchar" />
    </node>
    <node concept="1TJgyj" id="6yWW51Y2Otx" role="1TKVEi">
      <property role="IQ2ns" value="7547171304068826977" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="date" />
      <ref role="20lvS9" node="6yWW51XMuvq" resolve="Date" />
    </node>
  </node>
  <node concept="1TIwiD" id="6yWW51Y0seL">
    <property role="EcuMT" value="7547171304068203441" />
    <property role="3GE5qa" value="Application Component.All Communication.PrimitiveCommunication.TypesofData" />
    <property role="TrG5h" value="Integer" />
    <property role="34LRSv" value="int" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="6yWW51Y0t4A" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
</model>

