/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crimeproject;
import com.db4o.*;
import com.db4o.config.Configuration;
import com.db4o.config.EmbeddedConfiguration;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.db4o.query.Predicate;
import com.db4o.query.Query;
/**
 *
 *  Основной класс проекта
 */
public class CrimeProject {

    /**
     * @param args the command line arguments
     */
    public static void fillDB(ObjectContainer db){
        //criminals
        Criminal crim1 = new Criminal("Jason S. Glass","Male","Russia",62);
        Criminal crim2 = new Criminal("Felix","Male","Russia",70);
        Criminal crim3 = new Criminal("Oleg","Male","Armenia",52);
        Criminal crim4 = new Criminal("Coby","Male","Ukraine",68);
        Criminal crim5 = new Criminal("Kane","Male","Russia",53);
        Criminal crim6 = new Criminal("Michael","Male","Armenia",44);
        Criminal crim7 = new Criminal("Brett","Male","Ukraine",68);
        Criminal crim8 = new Criminal("Acton","Male","Uzbekistan",40);
        Criminal crim9 = new Criminal("Eaton","Male","Russia",27);
        Criminal crim10 = new Criminal("Evan","Male","Uzbekistan",19);
        Criminal crim11 = new Criminal("Zephania","Male","Armenia",23);
        Criminal crim12 = new Criminal("August","Male","Ukraine",30);
        Criminal crim13 = new Criminal("August","Male","Ukraine",30);
        Criminal crim14 = new Criminal("Xanthus","Male","Armenia",22);
        Criminal crim15 = new Criminal("Alvin","Male","Uzbekistan",37);
        Criminal crim16 = new Criminal("Harper","Male","Ukraine",60);
        Criminal crim17 = new Criminal("Alvin","Male","Armenia",60);
        Criminal crim18 = new Criminal("Andrew","Male","Armenia",65);
        Criminal crim19 = new Criminal("Preston","Male","Russia",37);
        Criminal crim20 = new Criminal("Addison","Male","Ukraine",22);
        Criminal crim21 = new Criminal("Coby","Male","Ukraine",22);
        Criminal crim22 = new Criminal("Curran","Male","Russia",46);
        Criminal crim23 = new Criminal("Abraham","Male","Uzbekistan",53);
        Criminal crim24 = new Criminal("Amos","Male","Russia",29);
        Criminal crim25 = new Criminal("Dale","Male","Ukraine",36);
        Criminal crim26 = new Criminal("Brennan","Male","Russia",63);
        Criminal crim27 = new Criminal("Jeremy","Male","Uzbekistan",32);
        Criminal crim28 = new Criminal("Porter","Male","Russia",31);
        Criminal crim29 = new Criminal("Cedric","Male","Ukraine",67);
        Criminal crim30 = new Criminal("Ferris","Male","Ukraine",22);
        Criminal crim31 = new Criminal("Rahim","Male","Russia",59);
        Criminal crim32 = new Criminal("Felix","Male","Ukraine",17);
        Criminal crim33 = new Criminal("Keith","Male","Russia",50);
        Criminal crim34 = new Criminal("Ray","Male","Armenia",66);
        Criminal crim35 = new Criminal("Laith","Male","Armenia",24);
        Criminal crim36 = new Criminal("Colby","Male","Uzbekistan",46);
        Criminal crim37 = new Criminal ("Gil","Male","Uzbekistan",28);
        Criminal crim38 = new Criminal("Curran","Male","Russia",42);
        Criminal crim39 = new Criminal("Victor","Male","Ukraine",57);
        Criminal crim40 = new Criminal("Zahir","Male","Ukraine",31);
        Criminal crim41 = new Criminal("Ezekiel","Male","Uzbekistan",53);
        Criminal crim42 = new Criminal("Demetrius","Male","Ukraine",31);
        Criminal crim43 = new Criminal("Merritt","Male","Russia",61);
        Criminal crim44 = new Criminal("Chester","Male","Russia",26);
        Criminal crim45 = new Criminal("Cain","Male","Ukraine",47);
        Criminal crim46 = new Criminal("Palmer","Male","Uzbekistan",27);
        Criminal crim47 = new Criminal("Davis","Male","Armenia",48);
        Criminal crim48 = new Criminal("Mark","Male","Russia",24);
        Criminal crim49 = new Criminal("Donovan","Male","Armenia",48);
        Criminal crim50 = new Criminal("Madeline","Female","Armenia",19);
        Criminal crim51 = new Criminal("Lee","Female","Armenia",58);
        Criminal crim52 = new Criminal("Zephr","Female","Ukraine",69);
        Criminal crim53 = new Criminal("Ruth","Female","Ukraine",29);
        Criminal crim54 = new Criminal("Cheyenne","Female","Uzbekistan",17);
        Criminal crim55 = new Criminal("Emi","Female","Russia",22);
        Criminal crim56 = new Criminal("Sydnee","Female","Uzbekistan",56);
        Criminal crim57 = new Criminal("Laurel","Female","Ukraine",46);
        Criminal crim58 = new Criminal("Joan","Female","Uzbekistan",21);
        Criminal crim59 = new Criminal("Alisa","Female","Armenia",45);
        Criminal crim60 = new Criminal("Gwendolyn","Female","Russia",53);
        Criminal crim61 = new Criminal("Justine","Female","Armenia",57);
        Criminal crim62 = new Criminal("Cara","Female","Uzbekistan",48);
        Criminal crim63= new Criminal("Rhoda","Female","Armenia",50);
        Criminal crim64 = new Criminal("Emma","Female","Armenia",67);
        Criminal crim65 = new Criminal("Clare","Female","Armenia",70);
        Criminal crim66 = new Criminal("Zoe","Female","Uzbekistan",51);
        Criminal crim67 = new Criminal("Mari","Female","Armenia",20);
        Criminal crim68 = new Criminal("Marcia","Female","Armenia",52);
        Criminal crim69 = new Criminal("Beatrice","Female","Uzbekistan",29);
        Criminal crim70 = new Criminal("Sloane","Female","Russia",58);
        
        /* ##################################################################
			Необходимо занести всех преступников в базу db.store(...)		
		###################################################################*/
		
        //elementofcrime
        
        ElementOfCrime el1 = new ElementOfCrime("убийство","ст.105 ч.1");
        ElementOfCrime el2 = new ElementOfCrime("убийство лица или его близких в связи с осуществлением данным лицом служебной деятельности или выполнением общественного долга","ст.105 ч.2 п.б");
        ElementOfCrime el3 = new ElementOfCrime("убийство малолетнего, а равно сопряженное с похищением человека","ст.105 ч.2 п. в");
        ElementOfCrime el4 = new ElementOfCrime("убийство лица, заведомо для виновного находящегося в беспомощном состоянии, а равно сопряженное с похищением человека","ст.105 ч.2 п. в");
        ElementOfCrime el5 = new ElementOfCrime("убийство женщины, заведомо для виновного находящейся в состоянии беременности","ст.105 ч.2 п. г");
        ElementOfCrime el6 = new ElementOfCrime("убийство, совершенное с особой жестокостью","ст.105 ч.2 п. д");
        ElementOfCrime el7 = new ElementOfCrime("убийство, совершенное общеопасным способом","ст.105 ч.2 п. е");
        ElementOfCrime el8 = new ElementOfCrime("убийство, совершенное из корыстных побуждений или по найму, а равно сопряженное с разбоем, вымогательством или бандитизмом","ст.105 ч.2 п. з");
        ElementOfCrime el9 = new ElementOfCrime("убийство, совершенное с целью скрыть другое преступление или облегчить его совершение, а равно сопряженное с изнасилованием или насильственными действиями сексуального характера","ст.105 ч.2 п. к");
        ElementOfCrime el10 = new ElementOfCrime("убийство, совершенное в целях использования органов или тканей потерпевшего","ст.105 ч.2 п. м");
        ElementOfCrime el11 = new ElementOfCrime("убийство матерью новорожденного ребенка (во время или сразу же после родов)","ст.106");
        ElementOfCrime el12 = new ElementOfCrime("убийство матерью новорожденного ребенка (в условиях психотравмирующей ситуации или в состоянии психического расстройства, не исключающего вменяемости","ст.106");
        ElementOfCrime el13 = new ElementOfCrime("убийство, совершенное при превышении пределов необходимой обороны","ст.108 ч.1");
        ElementOfCrime el14 = new ElementOfCrime("убийство, совершенное при превышении мер, необходимых для задержания лица, совершившего преступление","ст.108 ч.2");
        ElementOfCrime el15 = new ElementOfCrime("доведение до самоубийства","ст.110");
        ElementOfCrime el16 = new ElementOfCrime("умышленное причинение тяжкого вреда здоровью","ст.111 ч.1");
        ElementOfCrime el17 = new ElementOfCrime("умышленное причинение тяжкого вреда здоровью в отношении лица или его близких в связи с осуществлением данным лицом служебной деятельности или выполнением общественного долга","ст.111 ч.2 п.а");
        ElementOfCrime el18 = new ElementOfCrime("умышленное причинение тяжкого вреда здоровью в отношении малолетнего, а равно с особой жестокостью, издевательством или мучениями для потерпевшего","ст.111 ч.2 п.б");
        ElementOfCrime el19 = new ElementOfCrime("умышленное причинение тяжкого вреда здоровью в отношении лица, заведомо для виновного находящегося в беспомощном состоянии, а равно с особой жестокостью, издевательством или мучениями для потерпевшего","ст.111 ч.2 п.б");
        ElementOfCrime el20 = new ElementOfCrime("умышленное причинение тяжкого вреда здоровью общеопасным способом","ст.111 ч.2 п.в");
        ElementOfCrime el21 = new ElementOfCrime("умышленное причинение тяжкого вреда здоровью в целях использования органов или тканей потерпевшего","ст.111 ч.2 п.ж");
        ElementOfCrime el22 = new ElementOfCrime("умышленное причинение тяжкого вреда здоровью с применением оружия или предметов, используемых в качестве оружия","ст.111 ч.2 п.з");
        ElementOfCrime el23 = new ElementOfCrime("умышленное причинение тяжкого вреда здоровью, повлекшее по неосторожности смерть потерпевшего","ст.111 ч.4");
        
        /* ##################################################################
			Необходимо занести квалификации преступлений в базу db.store(...)		
		###################################################################*/
            
			//crimes
        Crime cr1 = new Crime(el1,crim1,"place1","2016:01:12");
        Crime cr2 = new Crime(el1,crim2,"place2","2016:01:12");
        Crime cr3 = new Crime(el1,crim3,"place3","2016:01:12");
        Crime cr4 = new Crime(el1,crim4,"place4","2016:01:12");
        Crime cr5 = new Crime(el1,crim5,"place5","2016:01:12");
        Crime cr6 = new Crime(el1,crim6,"place6","2016:01:12");
        Crime cr7 = new Crime(el1,crim7,"place7","2016:01:12");
        Crime cr8 = new Crime(el1,crim8,"place8","2016:01:12");
        Crime cr9 = new Crime(el1,crim9,"place9","2016:01:12");           
        Crime cr10 = new Crime(el2,crim1,"place10","2016:01:12");
        Crime cr11 = new Crime(el2,crim2,"place11","2016:01:12");
        Crime cr12 = new Crime(el2,crim3,"place12","2016:01:12");
        Crime cr13 = new Crime(el2,crim4,"place13","2016:01:12");
        Crime cr14 = new Crime(el2,crim5,"place14","2016:01:12");
        Crime cr15 = new Crime(el2,crim6,"place15","2016:01:12");
        Crime cr16 = new Crime(el2,crim7,"place16","2016:01:12");
        Crime cr17 = new Crime(el2,crim8,"place17","2016:01:12");
        Crime cr18 = new Crime(el2,crim9,"place18","2016:01:12");
        Crime cr19 = new Crime(el2,crim10,"place19","2016:01:12");
        Crime cr20 = new Crime(el2,crim11,"place20","2016:01:12");
        Crime cr21 = new Crime(el2,crim12,"place21","2016:01:12");
        Crime cr22 = new Crime(el2,crim13,"place22","2016:01:12");
        Crime cr23 = new Crime(el2,crim14,"place23","2016:01:12");
        Crime cr24 = new Crime(el2,crim15,"place24","2016:01:12");
        Crime cr25 = new Crime(el2,crim16,"place25","2016:01:12");
        Crime cr26 = new Crime(el2,crim17,"place26","2016:01:12");
        Crime cr27 = new Crime(el3,crim15,"place27","2016:01:12");
        Crime cr28 = new Crime(el3,crim16,"place28","2016:01:12");
        Crime cr29 = new Crime(el3,crim17,"place29","2016:01:12");
        Crime cr30 = new Crime(el4,crim20,"place30","2016:01:12");
        Crime cr31 = new Crime(el4,crim21,"place31","2016:01:12");
        Crime cr32 = new Crime(el4,crim22,"place32","2016:01:12");
        Crime cr33 = new Crime(el4,crim23,"place33","2016:01:12");
        Crime cr34 = new Crime(el4,crim24,"place34","2016:01:12");
        Crime cr35 = new Crime(el4,crim25,"place35","2016:01:12");
        Crime cr36 = new Crime(el4,crim26,"place36","2016:01:12");
        Crime cr37 = new Crime(el4,crim27,"place37","2016:01:12");
        Crime cr38 = new Crime(el4,crim28,"place38","2016:01:12");
        Crime cr39 = new Crime(el4,crim29,"place39","2016:01:12");
        Crime cr40 = new Crime(el5,crim25,"place40","2016:01:12");
        Crime cr41 = new Crime(el5,crim26,"place41","2016:01:12");
        Crime cr42 = new Crime(el5,crim27,"place42","2016:01:12");
        Crime cr43 = new Crime(el5,crim28,"place43","2016:01:12");
        Crime cr44 = new Crime(el5,crim29,"place44","2016:01:12");
        Crime cr45 = new Crime(el5,crim30,"place45","2016:01:12");
        Crime cr46 = new Crime(el5,crim31,"place46","2016:01:12");
        Crime cr47 = new Crime(el5,crim32,"place47","2016:01:12");
        Crime cr48 = new Crime(el5,crim33,"place48","2016:01:12");
        Crime cr49 = new Crime(el5,crim34,"place49","2016:01:12");
        Crime cr50 = new Crime(el5,crim35,"place50","2016:01:12");
        Crime cr51 = new Crime(el6,crim35,"place51","2016:01:12");
        Crime cr52 = new Crime(el6,crim36,"place52","2016:01:12");
        Crime cr53 = new Crime(el6,crim37,"place53","2016:01:12");
        Crime cr54 = new Crime(el6,crim38,"place54","2016:01:12");
        Crime cr55 = new Crime(el7,crim15,"place55","2016:01:12");
        Crime cr56 = new Crime(el7,crim16,"place56","2016:01:12");
        Crime cr57 = new Crime(el7,crim17,"place57","2016:01:12");
        Crime cr58 = new Crime(el7,crim18,"place58","2016:01:12");
        Crime cr59 = new Crime(el7,crim19,"place59","2016:01:12");
        Crime cr60 = new Crime(el7,crim20,"place60","2016:01:12");
        Crime cr61 = new Crime(el7,crim21,"place61","2016:01:12");
        Crime cr62 = new Crime(el7,crim22,"place62","2016:01:12");
        Crime cr63 = new Crime(el7,crim23,"place63","2016:01:12");
        Crime cr64 = new Crime(el7,crim24,"place64","2016:01:12");
        Crime cr65 = new Crime(el8,crim40,"place65","2016:01:12");
        Crime cr66 = new Crime(el8,crim41,"place66","2016:01:12");
        Crime cr67 = new Crime(el8,crim42,"place67","2016:01:12");
        Crime cr68 = new Crime(el8,crim43,"place68","2016:01:12");
        Crime cr69 = new Crime(el8,crim44,"place69","2016:01:12");
        Crime cr70 = new Crime(el8,crim45,"place70","2016:01:12");
        Crime cr71 = new Crime(el9,crim40,"place71","2016:01:12");
        Crime cr72 = new Crime(el9,crim41,"place72","2016:01:12");
        Crime cr73 = new Crime(el9,crim42,"place73","2016:01:12");
        Crime cr74 = new Crime(el9,crim43,"place74","2016:01:12");
        Crime cr75 = new Crime(el9,crim44,"place75","2016:01:12");
        Crime cr76 = new Crime(el9,crim45,"place76","2016:01:12");
        Crime cr77 = new Crime(el9,crim46,"place77","2016:01:12");
        Crime cr78 = new Crime(el9,crim47,"place78","2016:01:12");
        Crime cr79 = new Crime(el9,crim48,"place79","2016:01:12");
        Crime cr80 = new Crime(el10,crim38,"place80","2016:01:12");
        Crime cr81 = new Crime(el10,crim39,"place81","2016:01:12");
        Crime cr82 = new Crime(el10,crim40,"place82","2016:01:12");
        Crime cr83 = new Crime(el10,crim41,"place83","2016:01:12");
        Crime cr84 = new Crime(el10,crim42,"place84","2016:01:12");
        Crime cr85 = new Crime(el10,crim43,"place85","2016:01:12");
        Crime cr86 = new Crime(el10,crim44,"place86","2016:01:12");
        Crime cr87 = new Crime(el10,crim45,"place87","2016:01:12");
        Crime cr88 = new Crime(el10,crim46,"place88","2016:01:12");
        Crime cr89 = new Crime(el10,crim47,"place89","2016:01:12");
        Crime cr90 = new Crime(el11,crim45,"place90","2016:01:12");
        Crime cr91 = new Crime(el11,crim46,"place91","2016:01:12");
        Crime cr92 = new Crime(el11,crim47,"place92","2016:01:12");
        Crime cr93 = new Crime(el11,crim48,"place93","2016:01:12");
        Crime cr94 = new Crime(el11,crim49,"place94","2016:01:12");
        Crime cr95 = new Crime(el11,crim50,"place95","2016:01:12");
        Crime cr96 = new Crime(el11,crim51,"place96","2016:01:12");
        Crime cr97 = new Crime(el11,crim52,"place97","2016:01:12");
        Crime cr98 = new Crime(el11,crim53,"place98","2016:01:12");
        Crime cr99 = new Crime(el11,crim54,"place99","2016:01:12");
        Crime cr100 = new Crime(el11,crim55,"place100","2016:01:12");
        Crime cr101 = new Crime(el12,crim53,"place101","2016:01:12");
        Crime cr102 = new Crime(el12,crim54,"place102","2016:01:12");
        Crime cr103 = new Crime(el12,crim55,"place103","2016:01:12");
        Crime cr104 = new Crime(el12,crim56,"place104","2016:01:12");
        Crime cr105 = new Crime(el12,crim57,"place105","2016:01:12");
        Crime cr106 = new Crime(el12,crim58,"place106","2016:01:12");
        Crime cr107 = new Crime(el12,crim59,"place107","2016:01:12");
        Crime cr108 = new Crime(el12,crim60,"place108","2016:01:12");
        Crime cr109 = new Crime(el12,crim61,"place109","2016:01:12");
        Crime cr110 = new Crime(el12,crim62,"place110","2016:01:12");
        Crime cr111 = new Crime(el13,crim60,"place111","2016:01:12");
        Crime cr112 = new Crime(el13,crim61,"place112","2016:01:12");
        Crime cr113 = new Crime(el13,crim62,"place113","2016:01:12");
        Crime cr114 = new Crime(el13,crim63,"place114","2016:01:12");
        Crime cr115 = new Crime(el14,crim60,"place115","2016:01:12");
        Crime cr116 = new Crime(el14,crim61,"place116","2016:01:12");
        Crime cr117 = new Crime(el14,crim62,"place117","2016:01:12");
        Crime cr118 = new Crime(el14,crim63,"place118","2016:01:12");
        Crime cr119 = new Crime(el14,crim64,"place119","2016:01:12");
        Crime cr120 = new Crime(el14,crim65,"place120","2016:01:12");
        Crime cr121 = new Crime(el14,crim66,"place121","2016:01:12");
        Crime cr122 = new Crime(el14,crim67,"place122","2016:01:12");
        Crime cr123 = new Crime(el14,crim68,"place123","2016:01:12");
        Crime cr124 = new Crime(el14,crim69,"place124","2016:01:12");
        Crime cr125 = new Crime(el15,crim1,"place125","2016:01:12");
        Crime cr126 = new Crime(el15,crim2,"place126","2016:01:12");
        Crime cr127 = new Crime(el15,crim3,"place127","2016:01:12");
        Crime cr128 = new Crime(el15,crim4,"place128","2016:01:12");
        Crime cr129 = new Crime(el15,crim5,"place129","2016:01:12");
        Crime cr130 = new Crime(el15,crim6,"place130","2016:01:12");
        Crime cr131 = new Crime(el15,crim7,"place131","2016:01:12");
        Crime cr132 = new Crime(el15,crim8,"place132","2016:01:12");
        Crime cr133 = new Crime(el15,crim9,"place133","2016:01:12");
        Crime cr134 = new Crime(el15,crim10,"place134","2016:01:12");
        Crime cr135 = new Crime(el15,crim11,"place135","2016:01:12");
        Crime cr136 = new Crime(el16,crim15,"place136","2016:01:12");
        Crime cr137 = new Crime(el16,crim16,"place137","2016:01:12");
        Crime cr138 = new Crime(el16,crim17,"place138","2016:01:12");
        Crime cr139 = new Crime(el16,crim18,"place139","2016:01:12");
        Crime cr140 = new Crime(el17,crim20,"place140","2016:01:12");
        Crime cr141 = new Crime(el17,crim21,"place141","2016:01:12");
        Crime cr142 = new Crime(el17,crim22,"place142","2016:01:12");
        Crime cr143 = new Crime(el17,crim23,"place143","2016:01:12");
        Crime cr144 = new Crime(el17,crim24,"place144","2016:01:12");
        Crime cr145 = new Crime(el17,crim25,"place145","2016:01:12");
        Crime cr146 = new Crime(el17,crim26,"place146","2016:01:12");
        Crime cr147 = new Crime(el17,crim27,"place147","2016:01:12");
        Crime cr148 = new Crime(el17,crim28,"place148","2016:01:12");
        Crime cr149 = new Crime(el17,crim29,"place149","2016:01:12");
        Crime cr150 = new Crime(el18,crim15,"place150","2016:01:12");
        Crime cr151 = new Crime(el18,crim16,"place151","2016:01:12");
        Crime cr152 = new Crime(el18,crim17,"place152","2016:01:12");
        Crime cr153 = new Crime(el18,crim18,"place153","2016:01:12");
        Crime cr154 = new Crime(el18,crim19,"place154","2016:01:12");
        Crime cr155 = new Crime(el18,crim20,"place155","2016:01:12");
        Crime cr156 = new Crime(el18,crim21,"place156","2016:01:12");
        Crime cr157 = new Crime(el18,crim22,"place157","2016:01:12");
        Crime cr158 = new Crime(el18,crim23,"place158","2016:01:12");
        Crime cr159 = new Crime(el18,crim24,"place159","2016:01:12");
        Crime cr160 = new Crime(el19,crim35,"place160","2016:01:12");
        Crime cr161 = new Crime(el19,crim36,"place161","2016:01:12");
        Crime cr162 = new Crime(el19,crim37,"place162","2016:01:12");
        Crime cr163 = new Crime(el19,crim38,"place163","2016:01:12");
        Crime cr164 = new Crime(el19,crim39,"place164","2016:01:12");
        Crime cr165 = new Crime(el19,crim40,"place165","2016:01:12");
        Crime cr166 = new Crime(el19,crim41,"place166","2016:01:12");
        Crime cr167 = new Crime(el19,crim42,"place167","2016:01:12");
        Crime cr168 = new Crime(el19,crim43,"place168","2016:01:12");
        Crime cr169 = new Crime(el19,crim44,"place169","2016:01:12");
        Crime cr170 = new Crime(el20,crim15,"place170","2016:01:12");
        Crime cr171 = new Crime(el20,crim16,"place171","2016:01:12");
        Crime cr172 = new Crime(el20,crim17,"place172","2016:01:12");
        Crime cr173 = new Crime(el20,crim18,"place173","2016:01:12");
        Crime cr174 = new Crime(el20,crim19,"place174","2016:01:12");
        Crime cr175 = new Crime(el20,crim20,"place175","2016:01:12");
        Crime cr176 = new Crime(el20,crim21,"place176","2016:01:12");
        Crime cr177 = new Crime(el20,crim22,"place177","2016:01:12");
        Crime cr178 = new Crime(el20,crim23,"place178","2016:01:12");
        Crime cr179 = new Crime(el20,crim24,"place179","2016:01:12");
        Crime cr180 = new Crime(el20,crim25,"place180","2016:01:12");
        Crime cr181 = new Crime(el20,crim26,"place181","2016:01:12");
        Crime cr182 = new Crime(el20,crim27,"place182","2016:01:12");
        Crime cr183 = new Crime(el20,crim28,"place183","2016:01:12");
        Crime cr184 = new Crime(el20,crim29,"place184","2016:01:12");
        Crime cr185 = new Crime(el20,crim30,"place185","2016:01:12");
        Crime cr186 = new Crime(el20,crim31,"place186","2016:01:12");
        Crime cr187 = new Crime(el20,crim32,"place187","2016:01:12");
        Crime cr188 = new Crime(el20,crim33,"place188","2016:01:12");
        Crime cr189 = new Crime(el20,crim34,"place189","2016:01:12");
        Crime cr190 = new Crime(el20,crim35,"place190","2016:01:12");
        Crime cr191 = new Crime(el20,crim36,"place191","2016:01:12");
        Crime cr192 = new Crime(el20,crim37,"place192","2016:01:12");
        Crime cr193 = new Crime(el20,crim38,"place193","2016:01:12");
        Crime cr194 = new Crime(el20,crim39,"place194","2016:01:12");
        Crime cr195 = new Crime(el20,crim40,"place195","2016:01:12");
        Crime cr196 = new Crime(el20,crim41,"place196","2016:01:12");
        Crime cr197 = new Crime(el20,crim42,"place197","2016:01:12");
        Crime cr198 = new Crime(el20,crim43,"place198","2016:01:12");
        Crime cr199 = new Crime(el20,crim44,"place199","2016:01:12");
        Crime cr200 = new Crime(el20,crim45,"place200","2016:01:12");
        
        /* ##################################################################
			Необходимо занести преступления в базу db.store(...)		
		###################################################################*/
        
        //DistrictInfo
        ArrayList<Crime> crimes1 = new ArrayList();
        crimes1.add(cr1);
        crimes1.add(cr2);
        crimes1.add(cr3);
        crimes1.add(cr4);
        crimes1.add(cr5);
        crimes1.add(cr6);
        crimes1.add(cr7);
        crimes1.add(cr8);
        crimes1.add(cr9);
        crimes1.add(cr10);
        crimes1.add(cr11);
        crimes1.add(cr12);
        crimes1.add(cr13);
        crimes1.add(cr14);
        crimes1.add(cr15);
        crimes1.add(cr16);
        crimes1.add(cr17);
        crimes1.add(cr18);
        crimes1.add(cr19);
        crimes1.add(cr20);
        crimes1.add(cr21);
        crimes1.add(cr22);
        crimes1.add(cr23);
        crimes1.add(cr24);
        crimes1.add(cr25);
        crimes1.add(cr26);
        crimes1.add(cr27);
        crimes1.add(cr28);
        crimes1.add(cr29);
        crimes1.add(cr30);
        crimes1.add(cr31);
        crimes1.add(cr32);
        crimes1.add(cr33);
        crimes1.add(cr34);
        crimes1.add(cr35);
        crimes1.add(cr36);
        crimes1.add(cr37);
        crimes1.add(cr38);
        crimes1.add(cr39);

        ArrayList<Crime> crimes2 = new ArrayList();
        crimes2.add(cr40);
        crimes2.add(cr41);
        crimes2.add(cr42);
        crimes2.add(cr43);
        crimes2.add(cr44);
        crimes2.add(cr45);
        crimes2.add(cr46);
        crimes2.add(cr47);
        crimes2.add(cr48);
        crimes2.add(cr49);
        crimes2.add(cr50);
        crimes2.add(cr51);
        crimes2.add(cr52);
        crimes2.add(cr53);
        crimes2.add(cr54);
        crimes2.add(cr55);
        crimes2.add(cr56);
        crimes2.add(cr57);
        crimes2.add(cr58);
        crimes2.add(cr59);
        crimes2.add(cr60);
        crimes2.add(cr61);
        crimes2.add(cr62);
        crimes2.add(cr63);
        crimes2.add(cr64);
        crimes2.add(cr65);
        crimes2.add(cr66);
        crimes2.add(cr67);
        crimes2.add(cr68);
        crimes2.add(cr69);
        crimes2.add(cr70);
        crimes2.add(cr71);
        crimes2.add(cr72);
        crimes2.add(cr73);
        crimes2.add(cr74);
        crimes2.add(cr75);
        crimes2.add(cr76);
        crimes2.add(cr77);
        crimes2.add(cr78);
        crimes2.add(cr79);
        crimes2.add(cr80);
        crimes2.add(cr81);

        ArrayList<Crime> crimes3 = new ArrayList();
        crimes3.add(cr82);
        crimes3.add(cr83);
        crimes3.add(cr84);
        crimes3.add(cr85);
        crimes3.add(cr86);
        crimes3.add(cr87);
        crimes3.add(cr88);
        crimes3.add(cr89);
        crimes3.add(cr90);
        crimes3.add(cr91);
        crimes3.add(cr92);
        crimes3.add(cr93);
        crimes3.add(cr94);
        crimes3.add(cr95);
        crimes3.add(cr96);
        crimes3.add(cr97);
        crimes3.add(cr98);
        crimes3.add(cr99);
        crimes3.add(cr100);
        crimes3.add(cr101);
        crimes3.add(cr102);
        crimes3.add(cr103);
        crimes3.add(cr104);
        crimes3.add(cr105);
        crimes3.add(cr106);
        crimes3.add(cr107);
        crimes3.add(cr108);
        crimes3.add(cr109);
        crimes3.add(cr110);
        crimes3.add(cr111);
        crimes3.add(cr112);
        crimes3.add(cr113);
        crimes3.add(cr114);
        crimes3.add(cr115);
        crimes3.add(cr116);
        crimes3.add(cr117);
        crimes3.add(cr118);
        crimes3.add(cr119);
        crimes3.add(cr120);
        crimes3.add(cr121);
        crimes3.add(cr122);

        ArrayList<Crime> crimes4 = new ArrayList();
        crimes4.add(cr123);
        crimes4.add(cr124);
        crimes4.add(cr125);
        crimes4.add(cr126);
        crimes4.add(cr127);
        crimes4.add(cr128);
        crimes4.add(cr129);
        crimes4.add(cr130);
        crimes4.add(cr131);
        crimes4.add(cr132);
        crimes4.add(cr133);
        crimes4.add(cr134);
        crimes4.add(cr135);
        crimes4.add(cr136);
        crimes4.add(cr137);
        crimes4.add(cr138);
        crimes4.add(cr139);
        crimes4.add(cr140);
        crimes4.add(cr141);
        crimes4.add(cr142);
        crimes4.add(cr143);
        crimes4.add(cr144);
        crimes4.add(cr145);
        crimes4.add(cr146);
        crimes4.add(cr147);
        crimes4.add(cr148);
        crimes4.add(cr149);
        crimes4.add(cr150);
        crimes4.add(cr151);
        crimes4.add(cr152);
        crimes4.add(cr153);
        crimes4.add(cr154);
        crimes4.add(cr155);
        crimes4.add(cr156);
        crimes4.add(cr157);
        crimes4.add(cr158);
        crimes4.add(cr159);
        crimes4.add(cr160);
        crimes4.add(cr161);
        crimes4.add(cr162);

        ArrayList<Crime> crimes5 = new ArrayList();
        crimes5.add(cr163);
        crimes5.add(cr164);
        crimes5.add(cr165);
        crimes5.add(cr166);
        crimes5.add(cr167);
        crimes5.add(cr168);
        crimes5.add(cr169);
        crimes5.add(cr170);
        crimes5.add(cr171);
        crimes5.add(cr172);
        crimes5.add(cr173);
        crimes5.add(cr174);
        crimes5.add(cr175);
        crimes5.add(cr176);
        crimes5.add(cr177);
        crimes5.add(cr178);
        crimes5.add(cr179);
        crimes5.add(cr180);
        crimes5.add(cr181);
        crimes5.add(cr182);
        crimes5.add(cr183);
        crimes5.add(cr184);
        crimes5.add(cr185);
        crimes5.add(cr186);
        crimes5.add(cr187);
        crimes5.add(cr188);
        crimes5.add(cr189);
        crimes5.add(cr190);
        crimes5.add(cr191);
        crimes5.add(cr192);
        crimes5.add(cr193);
        crimes5.add(cr194);
        crimes5.add(cr195);
        crimes5.add(cr196);
        crimes5.add(cr197);
        crimes5.add(cr198);
        crimes5.add(cr199);
        crimes5.add(cr200);

        ArrayList<Criminal> criminals1 = new ArrayList();
        criminals1.add(crim1);
        criminals1.add(crim2);
        criminals1.add(crim3);
        criminals1.add(crim4);
        criminals1.add(crim5);
        criminals1.add(crim6);
        criminals1.add(crim7);
        criminals1.add(crim8);
        criminals1.add(crim9);
        criminals1.add(crim10);
        criminals1.add(crim11);
        criminals1.add(crim12);
        criminals1.add(crim13);
        criminals1.add(crim14);
        criminals1.add(crim15);
        criminals1.add(crim16);
        criminals1.add(crim17);
        criminals1.add(crim20);
        criminals1.add(crim21);
        criminals1.add(crim22);
        criminals1.add(crim23);
        criminals1.add(crim24);
        criminals1.add(crim25);
        criminals1.add(crim26);
        criminals1.add(crim27);
        criminals1.add(crim28);
        criminals1.add(crim29);

        ArrayList<Criminal> criminals2 = new ArrayList();
        criminals2.add(crim25);
        criminals2.add(crim26);
        criminals2.add(crim27);
        criminals2.add(crim28);
        criminals2.add(crim29);
        criminals2.add(crim30);
        criminals2.add(crim31);
        criminals2.add(crim32);
        criminals2.add(crim33);
        criminals2.add(crim34);
        criminals2.add(crim35);
        criminals2.add(crim36);
        criminals2.add(crim37);
        criminals2.add(crim38);
        criminals2.add(crim15);
        criminals2.add(crim16);
        criminals2.add(crim17);
        criminals2.add(crim18);
        criminals2.add(crim19);
        criminals2.add(crim20);
        criminals2.add(crim21);
        criminals2.add(crim22);
        criminals2.add(crim23);
        criminals2.add(crim24);
        criminals2.add(crim40);
        criminals2.add(crim41);
        criminals2.add(crim42);
        criminals2.add(crim43);
        criminals2.add(crim44);
        criminals2.add(crim45);
        criminals2.add(crim46);
        criminals2.add(crim47);
        criminals2.add(crim48);
        criminals2.add(crim38);
        criminals2.add(crim39);

        ArrayList<Criminal> criminals3 = new ArrayList();
        criminals3.add(crim40);
        criminals3.add(crim41);
        criminals3.add(crim42);
        criminals3.add(crim43);
        criminals3.add(crim44);
        criminals3.add(crim45);
        criminals3.add(crim46);
        criminals3.add(crim47);
        criminals3.add(crim48);
        criminals3.add(crim49);
        criminals3.add(crim50);
        criminals3.add(crim51);
        criminals3.add(crim52);
        criminals3.add(crim53);
        criminals3.add(crim54);
        criminals3.add(crim55);
        criminals3.add(crim56);
        criminals3.add(crim57);
        criminals3.add(crim58);
        criminals3.add(crim59);
        criminals3.add(crim60);
        criminals3.add(crim61);
        criminals3.add(crim62);
        criminals3.add(crim63);
        criminals3.add(crim64);
        criminals3.add(crim65);
        criminals3.add(crim66);
        criminals3.add(crim67);

        ArrayList<Criminal> criminals4 = new ArrayList();
        criminals4.add(crim68);
        criminals4.add(crim69);
        criminals4.add(crim1);
        criminals4.add(crim2);
        criminals4.add(crim3);
        criminals4.add(crim4);
        criminals4.add(crim5);
        criminals4.add(crim6);
        criminals4.add(crim7);
        criminals4.add(crim8);
        criminals4.add(crim9);
        criminals4.add(crim10);
        criminals4.add(crim11);
        criminals4.add(crim15);
        criminals4.add(crim16);
        criminals4.add(crim17);
        criminals4.add(crim18);
        criminals4.add(crim19);
        criminals4.add(crim20);
        criminals4.add(crim21);
        criminals4.add(crim22);
        criminals4.add(crim23);
        criminals4.add(crim24);
        criminals4.add(crim25);
        criminals4.add(crim26);
        criminals4.add(crim27);
        criminals4.add(crim28);
        criminals4.add(crim29);
        criminals4.add(crim35);
        criminals4.add(crim36);
        criminals4.add(crim37);

        ArrayList<Criminal> criminals5 = new ArrayList();
        criminals5.add(crim38);
        criminals5.add(crim39);
        criminals5.add(crim40);
        criminals5.add(crim41);
        criminals5.add(crim42);
        criminals5.add(crim43);
        criminals5.add(crim44);
        criminals5.add(crim15);
        criminals5.add(crim16);
        criminals5.add(crim17);
        criminals5.add(crim18);
        criminals5.add(crim19);
        criminals5.add(crim20);
        criminals5.add(crim21);
        criminals5.add(crim22);
        criminals5.add(crim23);
        criminals5.add(crim24);
        criminals5.add(crim25);
        criminals5.add(crim26);
        criminals5.add(crim27);
        criminals5.add(crim28);
        criminals5.add(crim29);
        criminals5.add(crim30);
        criminals5.add(crim31);
        criminals5.add(crim32);
        criminals5.add(crim33);
        criminals5.add(crim34);
        criminals5.add(crim35);
        criminals5.add(crim36);
        criminals5.add(crim37);
        criminals5.add(crim38);
        criminals5.add(crim39);
        criminals5.add(crim40);
        criminals5.add(crim41);
        criminals5.add(crim42);
        criminals5.add(crim43);
        criminals5.add(crim44);
        criminals5.add(crim45);

        DistrictInfo di1= new DistrictInfo("Nevskiy",crimes1,criminals1);
        DistrictInfo di2= new DistrictInfo("Admiralteyskiy",crimes2,criminals2);
        DistrictInfo di3= new DistrictInfo("Centralniy",crimes3,criminals3);
        DistrictInfo di4= new DistrictInfo("Kirovskiy",crimes4,criminals4);
        DistrictInfo di5= new DistrictInfo("Krasnoselskiy",crimes5,criminals5);

		/* ##################################################################
			Необходимо занести районы в базу db.store(...)		
		###################################################################*/
        
        db.store(el1);
        db.store(el2);
        db.store(el3);
        db.store(el4);
        db.store(el5);
        db.store(el6);
        db.store(el7);
        db.store(el8);
        db.store(el9);
        db.store(el10);
        db.store(el11);
        db.store(el12);
        db.store(el13);
        db.store(el14);
        db.store(el15);
        db.store(el16);
        db.store(el17);
        db.store(el18);
        db.store(el19);
        db.store(el20);
        db.store(el21);
        db.store(el22);
        db.store(el23);
        
        db.store(crimes1);
        db.store(crimes2);
        db.store(crimes3);
        db.store(crimes4);
        db.store(crimes5);
        
        db.store(criminals1);
        db.store(criminals2);
        db.store(criminals3);
        db.store(criminals4);
        db.store(criminals5);
        
        db.store(di1);
        db.store(di2);
        db.store(di3);
        db.store(di4);
        db.store(di5);
    }
        
    //print Result
    public static void objectResult(ObjectSet result) {
        System.out.println(result.size());
        while(result.hasNext()) {
            System.out.println(result.next());
        }
    }
    
    public static void listResult(List<?> result){
    	System.out.println(result.size());
        result.forEach((o) -> {
            System.out.println(o);
        });
    }
	
	
        /* ################################################################################
			Необходимо написать тела, представленных ниже,10ти функций работы с данными БД,
			Применение данных функций смотрите в main
		#################################################################################*/	
	
	
//1. Найти всех преступников по имени - queryByExample
    public static void findCriminalByName (ObjectContainer db, String name){    
    	ObjectSet result = db.query(new Predicate<Criminal>(){
    		public boolean match(Criminal c) {
    			return c.getName().equals(name);
    		}
    	});
    	 System.out.println("1. Найти всех преступников по имени - queryByExample");
    	//objectResult(result);
    }
	
//2. Найти всех преступников    
    public static void findAllCriminals (ObjectContainer db){    
    	ObjectSet result = db.query(new Predicate<Criminal>(){
    		public boolean match(Criminal c) {
    			return c.getName() != "";
    		}
    	});
    	System.out.println("2. Найти всех преступников");
    	objectResult(result);    
    }
    
//3. Найти все преступления, которые совершил определенный человек (имя, возраст) native queries
    public static void findAllCrimesByCriminalNameAndAge(ObjectContainer db, Criminal crim_test){		
    	ObjectSet result = db.query(new Predicate<Crime>(){
    		public boolean match(Crime crm) {
    			return crm.getCriminal().toString().contains(crim_test.toString());
    		}
    	});
    	System.out.println("3. Найти все преступления, которые совершил определенный человек (имя, возраст) native queries");
    	objectResult(result);  
    }
    
//4. Получить текст статьи УК по номеру (все пункты и части)
    public static void findArticle(ObjectContainer db, String article){	
    	ObjectSet result = db.query(new Predicate<ElementOfCrime>(){
    		public boolean match(ElementOfCrime eoc) {
    			return eoc.getNumber().contains(article);
    		}
    	});
    	System.out.println("4. Получить текст статьи УК по номеру (все пункты и части)");
    	objectResult(result);	
    }
   
//5. Найти все районы, в которых совершались преступления по определенной статье (group by districts, name - queryByExample)
    public static void findDistrictsByArticleGroupByName(ObjectContainer db){		
    	Query query = db.query();
    	query.constrain(Crime.class);
    	query.descend("elementOfCrime").descend("number").constrain("ст.105 ч.1");
    	//Query placequery = query.descend("date");
    	ObjectSet result = query.execute();

    	System.out.println("5. Найти все районы, в которых совершались преступления по определенной статье (group by districts, name - queryByExample)");
    	listResult(result); 
    }

//6. Вывести преступления, которое совершили определенные люди определенного числа в определенном месте
    public static void findCrimeByCriminalDatePlace(ObjectContainer db, String[] criminals, String[] places, String[] dates){		
    	System.out.println(Arrays.toString(dates));
    	ObjectSet result = db.query(new Predicate<Crime>(){
    		public boolean match(Crime c) {
    			return Arrays.toString(places).contains(c.getPlace()) && Arrays.toString(criminals).contains(c.getCriminal().getName()) && Arrays.toString(dates).contains(c.getDate());
    		}
    	});
    	System.out.println("6. Вывести преступления, которое совершили определенные люди определенного числа в определенном месте");
    	objectResult(result); 
    }
    
//7. Вывести всех преступников с группировкой по возрасту
    public static void findAllCriminalsGroupByAge(ObjectContainer db){			
    	Query query=db.query();
    	query.constrain(Criminal.class);
    	query.descend("age").orderAscending();
    	ObjectSet result=query.execute();
    	//query.descend("name").orderDescending();

    	System.out.println("7. Вывести всех преступников с группировкой по возрасту");
    	objectResult(result);     
    }
    
//8. В каких районах совершил преступление определенный человек (имя и фамилия) и где именно (место)
    public static void findAllDistrictForCriminalGroupByName(ObjectContainer db, String name){		
    	ObjectSet result = db.query(new Predicate<Crime>(){
    		public boolean match(Crime crm) {
    			return crm.getCriminal().GroupByName != null && crm.getCriminal().getName().equals(name);
    		}
    	});
    	System.out.println("8. В каких районах совершил преступление определенный человек (имя и фамилия) и где именно (место)");
    	objectResult(result); 
    }
    
//8.1. В каких районах совершил преступление определенный человек (имя) и сколько раз
    public static void findAllDistrictForCriminalGroupByDistrict(ObjectContainer db, String name){
    	ObjectSet result = db.query(new Predicate<Crime>(){
    		public boolean match(Crime crm) {
    			return crm.getCriminal().getName().equals(name);
    		}
    	});
    	System.out.println("8.1. В каких районах совершил преступление определенный человек (имя) и сколько раз");
    	objectResult(result);
    }
    
//9. Вывести люди, которые осуждены не за убийство
    public static void findCriminalNotKiller(ObjectContainer db){		
		/* ... */        
    }
    
//10. Вывести преступниц от 18 до 30 лет
    public static void findCriminalsFemale(ObjectContainer db){       
	   /* ... */ 
    }
   
    public static void main(String[] args)  throws Exception
    {    
       
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded
        .newConfiguration(), "crimeProject.db");
        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        config.common().objectClass(Criminal.class).objectField("name").indexed(true);
        config.common().objectClass(Criminal.class).objectField("age").indexed(true);
        config.common().objectClass(Criminal.class).objectField("sex").indexed(true);
        config.common().objectClass(ElementOfCrime.class).objectField("text").indexed(true);
        config.common().objectClass(ElementOfCrime.class).objectField("number").indexed(true);
        config.common().objectClass(Crime.class).objectField("place").indexed(true);
        config.common().objectClass(Crime.class).objectField("criminal").indexed(true);
        config.common().objectClass(Crime.class).objectField("elementOfCrime").indexed(true);
        config.common().objectClass(Crime.class).objectField("date").indexed(true);
        config.common().objectClass(DistrictInfo.class).objectField("criminals").indexed(true);
		
        try {			
			
    //    fillDB(db);
		 
    //1. Нати всех преступников по имени          
        findCriminalByName(db,"Felix");
            
    //2. Нати всех преступников
        findAllCriminals(db);
		
    //3. Все преступления, которые совершил определенный человек (имя, возраст)
        Criminal crim_test = new Criminal("Felix","Male","Russia",70);
        findAllCrimesByCriminalNameAndAge(db,crim_test);
		
    //4. Получить текст статьи УК по номеру (все пункты и части)
        findArticle(db,"ст.105");
            
    //5. Найти все районы, в которых совершались преступления по определенной статье (Группировка по статье)
        findDistrictsByArticleGroupByName(db);
            
    //6. Вывести преступления, которое совершили определенные люди, определенного числа в определенном месте
        String[] criminals = {"Emma","Davis","Mark","Oleg"};
        String[] places = {"place78","place79","place89","place93","place119"};
        String[] dates = {"2016:01:12","2016:01:12"};
        findCrimeByCriminalDatePlace(db,criminals,places,dates);
            
    //7. Вывести всех преступников с группировкой во возрасту
        findAllCriminalsGroupByAge(db);
            
    //8. В каких районах совершил преступление определенный человек (имя и фамилия) с группировкой по имени
        findAllDistrictForCriminalGroupByName(db,"Oleg");
		 
    //8.1.В каких районах совершил преступление определенный человек (имя и фамилия) с группировкой по району
        findAllDistrictForCriminalGroupByDistrict(db,"Oleg");
            
    //9. Вывести людей, которые осуждены не за убийство
        findCriminalsFemale(db);
            
    //10. Вывести преступниц от 18 до 30 лет
        findCriminalNotKiller(db);
		   
        } finally {
            db.close();
        }
    }
    
}
