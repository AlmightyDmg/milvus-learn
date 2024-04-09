package com.dmg.milvuslearn.test;

import io.milvus.client.MilvusServiceClient;
import io.milvus.param.ConnectParam;

public class MyTest {
    public static void main(String[] args) {

        double[] arr = {0.00017472648, 0.008512267, 0.017020484, 0.0026429854, -0.002891445, 0.018568927, -0.00042671815, -0.012499886, -0.03088612, -0.028872019, -0.0114553915, 0.018027328, 0.0070177177, 0.006613783, 0.013495727, 0.011302881, -0.00090380595, -0.00432178, -0.025352877, -0.06840451, -0.014475672, -0.03221631, 0.030012626, -0.007984419, -0.011550517, -0.017015541, 0.028481059, 0.024522943, 0.025524184, 0.02389739, -0.0017048212, 0.05661284, -0.0032653457, -0.002947224, -0.025372928, 0.0005423092, -0.013143268, -0.0014157814, 0.023158913, -0.010379877, 0.027137874, 0.003276275, -0.029554076, 0.036036614, 0.012729204, -0.022513881, -0.15114327, -0.0022879785, -0.036426533, -0.011583607, 0.0119895255, 0.016831022, -0.004030118, 0.024426574, -0.0031283076, 0.021991221, 0.0005872741, 0.012970724, 0.017725646, -0.018708259, 0.01695695, 0.015988171, -0.014904864, 0.017992757, -0.069839664, -0.008844215, -0.0071842168, 0.020307472, 0.01148647, -0.042524252, -0.010500648, -0.022936642, 0.01635431, 0.019620834, 0.015642393, -0.019391092, 0.021620655, -0.0055023655, 0.0052182064, -0.039655548, -0.01700761, -0.017771164, 0.05925236, -0.024070846, 0.024422975, 0.01688647, -0.011051664, -0.00896938, -0.020335061, 0.029639697, -0.03671435, -0.039421964, 0.043192696, 0.050670452, 0.022456085, 0.025934193, -0.00046281578, 0.02972301, 0.056870986, 0.019705294, -0.009833621, 0.030162342, -0.015466085, 0.036475968, -0.048425682, -0.03203011, -0.016906004, 0.009249739, -0.062470485, -0.11309343, -0.055289634, 0.02201252, -0.038536787, 0.015356833, -0.004739279, 0.01481469, -0.0060696085, -0.041712053, 0.0058615822, 0.016823515, -0.009044918, 0.070753366, 0.011069786, 0.03604288, 0.014878438, 0.01805558, 0.033528432, 0.025259705, -0.019368948, 0.01863368, 0.022126138, 0.03093445, -0.009665005, -0.007597795, 0.0069581307, 0.010024793, 0.022866188, 0.012946731, -0.02583231, 0.017531363, -0.06285072, -0.009049047, -0.14739482, 0.03323481, 0.041818015, -0.0077733872, -0.021337174, 0.019976618, -0.018621547, 0.014973738, -0.006799037, 0.020226086, -0.009375818, 0.03403055, -0.016404124, 0.07430463, -0.02525419, -0.033561535, 0.035964727, 0.0030155822, -0.01577273, 0.01619529, -0.04991447, -0.01954583, 0.021896964, -0.040741753, -0.006791731, -0.006640114, -0.0315158, 0.007611794, -0.025363732, -0.014009248, -0.01945023, -0.03452786, 0.003326399, -0.007619437, 0.04835325, -0.0010149364, -0.012920811, 0.02020083, -0.041276276, -0.014706602, 0.03330468, -0.027531847, -0.016650802, -0.0034475275, 0.05054106, 0.021291886, 0.005799618, 0.015332192, 0.0021441982, -0.026083356, 0.06568697, -0.026232494, 0.08360324, 0.016705073, 0.02217976, 0.04170763, -0.016785104, -0.0019725082, -0.0074678855, -0.027919242, 0.025020571, -0.015564179, -0.03486105, 0.13289082, -0.004850926, -0.034711987, -0.02150792, 0.0141702965, 0.022698903, 0.011992677, 0.0030495275, -0.01839684, 0.004643125, -0.002172646, 0.020379083, -0.0032368042, 0.008555605, -0.026782414, 0.04986086, 0.016640564, 0.031404335, 0.015534254, -0.0013766991, 0.064527445, 0.02513815, 0.027642129, 0.025695806, -0.054475896, 0.0016376448, 0.015218644, 0.0125097055, 0.0041341926, 0.014685633, 0.005506794, 0.0037182032, -0.0036303708, -0.0066022016, -0.013973266, 0.023073195, 0.015017853, 0.00020647817, 0.048974965, 0.0030713135, -0.0071800305, -0.017305704, 0.04084382, -0.037418596, -0.004790974, 0.012273053, 0.0042415364, -0.027681326, -0.0032572285, -0.014429437, 0.0029228374, 0.00035238324, -0.025342261, -0.0069584916, 0.005351728, 0.029512482, -0.0077741775, -0.0074091163, -0.005332106, -0.0022229105, -0.045729216, -0.013947366, -0.025493268, 0.07293633, 0.033255793, -0.010423078, 0.03018282, -0.0203279, -0.20715989, -0.034361202, -0.02612399, -0.0036572628, 0.046610307, -0.026458064, -0.0076015852, 0.011988106, 0.020035578, 0.0437641, -0.01687946, -0.0016970906, -0.0097011225, -0.031558137, -0.018727953, -0.00704333, -0.012685533, 0.001873784, 0.04261029, -0.009610782, -0.035574205, 0.019496204, -0.010724734, -0.0086606825, -0.008474443, 0.017896634, 0.012269485, -0.0021274155, 0.016619349, -0.005186517, -0.009481893, 0.0032983264, -0.01968881, -0.023830285, -0.001054932, -0.4760169, -0.014997166, 0.0033208465, -0.0051837955, -0.021533974, -0.028593408, 0.057983108, -0.011568798, 0.007958859, -0.02108563, -0.0025154639, 0.04240199, -0.040722672, 0.016481064, 0.018476926, 0.05212536, 0.0012135326, 0.023583038, 0.0279276, 0.0042923465, 0.0030408811, -0.019398348, -0.03846747, 0.043011405, -0.009293362, 0.034225233, -0.076925784, 0.027313208, -0.055094894, -0.023327753, -0.0067305807, -0.0040126476, -0.0077645606, -0.023255609, -0.0069189793, 0.00067726185, 0.033146724, 0.06485248, 0.017848913, 0.0050227973, 0.008724499, 0.048047084, -0.0107213855, 0.016683517, 0.046875443, 0.0062025753, -0.029960595, 0.003870833, -0.027771719, 0.014336478, 0.015754184, -0.015910879, 0.064257, 0.048421618, 0.043054987, -0.013347064, 4.9129547e-05, 0.045803808, 0.0031748246, 0.02688007, 0.006922365, -0.019118017, 0.008741587, -0.04992592, -0.07052269, -0.009388694, 0.0035300017, -0.005045164, 0.013687086, -0.023039944, -0.0131979305, 0.047128942, 0.020478897, -0.06840635, 0.010066598, 0.007979439, -0.033736974, -0.011826136, 0.005014288, 0.038645692, -0.058716185, -0.01650491, 0.023429105, 0.005832549, -0.0036714491, -0.026445698, -0.004218498, -0.011456713, 0.0017309748, 0.012661136, 0.0085318815, -0.02398842, 0.0019159585, 0.020095348, 0.057997085, 0.008074254, 0.049526803, -0.031281434, -0.008156503, -0.014833279, 0.022421706, -0.022610096, -0.039465077, -0.04746995, -0.015128602, 0.031716265, -0.0072482773, 0.030304285, 0.03662759, 3.634778e-05, 0.019807683, 0.015888184, -0.03406946, 0.015950505, 0.040898718, -0.012124279, -0.031630687, 0.018136924, 0.015975572, -0.009808476, -0.010227619, -0.0016169464, -0.01952222, -0.037237827, 0.01217253, 0.010001044, -0.019980185, 0.018455219, -0.04649905, 0.044630613, -0.015090092, 0.03826889, 0.027643267, -0.06419844, 0.0044006994, -0.03504674, -0.053676907, 0.0073076333, -0.0015456247, -0.021456514, -0.015828406, -0.001896014, 0.047867704, 0.02931971, 0.025637124, -0.004667166, -0.008835502, 0.014421709, -0.033737507, -0.018906202, 0.014973036, -0.044282068, 0.0391174, 0.0070874016, 0.014632116, -5.7006084e-05, 0.028262142, -0.0048002815, 0.040163253, 0.011767118, 0.066078514, -0.055962726, -0.090216346, 0.03582892, -0.0008959588, 3.730589e-05, 0.032857444, -0.012819025, -0.007893029, -0.00089442276, 0.00043674235, -0.02357738, -0.047229458, -0.012579235, 0.0023919125, -0.012101469, -0.012366621, -0.0021583564, 0.0034815602, -0.014797993, -0.0019421731, 0.029024063, -0.0013059326, 0.038962718, 0.015358766, -0.029541692, -0.011044003, -0.015621526, -0.02109047, -0.008424094, 0.032743793, 0.014000625, 0.035123616, 0.049206883, -0.019171918, -0.049800254, 0.017638735, 0.014836602, 0.013224882, -0.024806486, 0.0064935037, 0.0034812132, -0.017397463, 0.028207762, 0.025478318, -0.013643868, 0.002446523, -0.0065880558, 0.0006422994, -0.017809218, -0.039114423, -0.06681746, 0.008197503, 0.015475388, -0.023225185, -0.01685266, 0.014654274, -0.002231688, -0.027563045, 0.005786219, -0.0047930903, -0.016024338, -0.070267186, -0.026079984, -0.0123704, 0.019661298, 0.023248764, -0.06359081, -0.0043334123, -0.0049106637, -0.0021182662, -0.016350573, 0.005944613, 0.03596646, 0.009080887, 0.021796318, -0.004785647, 0.030418793, 0.0034560768, 0.0012661539, 0.026415085, 0.014156273, -0.015565887, -0.02237374, -0.02502681, 0.055336494, -0.0026014533, -0.0025646563, -0.014147448, 0.034194328, 0.0076739355, -0.018097399, 0.001043151, -0.010437704, 0.07232964, 0.010165946, -0.0056017013, -0.0018372202, 0.010214629, 0.020124178, -0.024162076, 0.012693551, -0.0055421856, -0.020792969, -0.026051614, 0.025201932, -0.03539884, -0.028297491, 0.0055121537, -0.011012206, -0.013006247, 0.0024992318, 0.02743257, 0.040789835, -0.0030440416, -0.013276381, -0.050858136, 0.03180659, 0.001436065, 0.014340019, 0.06498172, -0.010505286, 0.005969017, -0.030922972, 0.022512408, 0.008731582, 0.021790301, 0.017382253, -0.015487308, 0.012851716, -0.014268247, 0.024729855, -0.036061004, 0.0032079644, -0.0013795871, 0.017025968, 0.028180435, -0.025130786, -0.022526631, -0.005026121, -0.046041332, 0.041409735, 0.037287794, -0.013695117, 0.039242472, 0.009120313, -0.0060476814, 0.008337218, -0.016758835, -0.02454139, 0.018809887, 0.01176646, -0.008963703, 0.05547233, -0.028180659, 0.004565408, 0.006260214, -0.013886611, 0.024776015, 0.0033619371, 0.028350174, 0.06038458, 0.035648316, -0.022172472, 0.020140914, 0.0076871794, 0.01652842, -0.025607718, 0.0077527524, 0.014250092, 0.010166926, 0.0069358293, 0.006611616, 0.051170927, 0.0033404592, 0.020784335, -0.008016647, -0.029990356, -0.024073899, 0.026513645, 0.024387836, 0.039668854, -0.013543841, -0.016315134, -0.015984023, -0.0021490068, 0.0011103807, 0.019346414, 0.00037431042, 0.04837282, 0.0029857624, -0.014641313, -0.045682747, 0.026802465, -0.059849728, -0.013216985, -0.014264877, 0.00027360552, -0.050369617, -0.12681411, 0.0064782193, 0.012626901, -0.005599111, -0.007356008, 0.030900603, 0.017209494, -0.017798139, -0.011943228, -0.0029003092, 0.02704469, 0.0017975417, 0.022685457, 0.024574013, 0.026376266, -0.009619847, -0.05630794, -0.014694208, 0.0009109965, -0.0043561095, 0.03348134, -0.022546299, -0.010221855, 0.021360964, -0.00076968165, 0.017860133, -0.039117377, -0.027302643, 0.02457612, -0.035444144, -0.0017321059, 0.010839039, -0.0011567604, 0.00824756, 0.04996866, -0.03299057, 0.0044507794, -0.014509137, 0.0119605325, -0.0075902664, 0.028920855, 0.005107368, -0.028760452, -0.0038188277, 0.015752302, -0.030194664, 0.017424505, -0.044509944, -0.0033123242, -0.0135338735, 0.031217966, 0.06687695, 0.0022291685, -0.006468203, 0.010600528, 0.005337302, 0.062234066, 0.05581968, 0.0048814067, -0.01518868, 0.04276333, -0.016445924, -0.04224201, 0.03133397, 0.025668308, 0.011748758, -0.0027192244, -0.0006040351, -0.008414294, -0.0025708673, 0.028643794, 0.012800549, -0.018309886, -0.021097893, 0.025518592, -0.016956847, 0.0056158192, 0.01991725, 0.017049117, 0.022373473, 0.0017229196, -0.04436959, -0.022540381, 0.031563796, 0.02327761, -0.33523893, 0.03787133, 0.024857247, -0.0302201, -0.038858563, 0.021815365, -0.019139493, -0.025654789, 0.020157525, -0.009900423, -0.017089924, 0.008688094, 0.020113885, -0.0078340955, 0.0040157503, -0.014936114};
        double[] arr1 = {-0.02268941, -0.0042985273, 0.022699594, -0.010835589, -0.032515414, 0.022594128, 0.04814247, -0.016889086, -0.013524689, -0.04605055, -0.018707927, 0.0051836185, -0.0183421, -0.022747176, -0.0142961815, 0.017350746, 0.014691934, 0.06257844, -0.028156307, -0.019673897, -0.0372967, -0.0316504, 0.01761909, -0.014950482, 0.01087791, 0.008952573, 0.040096816, 0.05190528, -0.021020781, -0.0011840399, 0.005680898, 0.023643797, -0.0019934596, -0.040321935, 0.0074101896, -0.02375849, -0.014094545, 0.0010188736, -0.014244693, -0.039297897, 0.019381687, 0.022625685, -0.014361941, 0.05282554, -0.011502188, -0.044477805, -0.17900307, -0.016293278, -0.014931091, -0.022127207, -0.03510001, 0.03328234, 0.017922236, -0.00044457454, -0.035005867, 0.049626093, -0.06900586, -0.014979503, -0.025972523, 0.023089428, 0.00077074487, -0.005200073, -0.0454377, 0.0022786392, -0.044936966, 0.01593636, 0.014911156, 0.032032333, 0.014483953, -0.0020678823, 0.026211996, 0.016136736, -0.018512776, 0.016001211, -0.05168272, -0.0020240427, -0.0073503996, -0.004388419, 0.05025472, -0.004981065, 0.021939984, -0.021398082, 0.03752879, -0.037468016, 0.04070309, -0.032840785, 0.007605806, 0.04412063, -0.022911318, 0.054273304, 0.03811558, -0.06256684, 0.035293482, 0.066488996, 0.059228882, -0.014208898, -0.005642041, -0.026640205, 0.017193468, -0.010750088, -0.031618774, 0.014910814, -0.028812548, -0.012331048, -0.0009325498, -0.07010642, -0.053290814, -0.05336524, -0.03670568, 0.015602686, -0.019927653, 0.03831921, 0.010072099, -0.0029373562, -0.027792292, 0.035417534, 0.02701662, 0.0053299484, -0.006586677, 0.0059423996, 0.05604773, 0.06741203, 0.007546816, 0.004616058, 0.051705696, 0.010139971, 0.055549756, -0.012741933, -0.032913607, 0.022732152, 0.034526013, 0.03354596, -0.0218738, -0.03870481, 0.014503445, -0.05234255, 0.026360149, 0.03086724, 0.04046157, 0.022851901, -0.031179344, 0.0025420347, -0.031157173, 0.028590456, 0.03878553, 0.0065830667, -0.021054383, -0.016590253, -0.008827709, 0.0019657665, -0.00043696328, 0.03613499, -0.049023125, 0.032109354, -0.018607879, 0.035583284, -0.038511373, -0.0317062, -0.010526138, 0.0074541746, 0.0399992, 0.013955851, -0.04049596, -0.049940012, 0.023181679, -0.046954334, -0.020746555, 0.027674144, 0.050474077, -0.009180254, -0.039702773, 0.008486298, -0.0061123786, -0.024085369, 0.04893855, -0.013620899, 0.05808717, 0.04203907, -0.009739342, 0.025035303, -0.041488666, 0.006538922, -0.042438824, -0.02734627, 0.053526305, 0.00095618435, 0.0051707774, 0.0167129, 0.05542727, 0.02874549, -0.039643202, -0.0042069983, 0.037801392, -0.020441553, 0.05404079, -0.012243151, -0.03960925, 0.09343955, 0.038133055, 0.011681724, -0.033573102, 0.017904118, 0.015660314, 0.029930448, -0.045532774, 0.026308602, -0.0015319237, -0.0006480343, -0.0172123, 0.042366095, 0.033191763, -0.0051550055, -0.034517173, -0.0265463, 0.010665486, -0.02643928, -0.0022346927, -0.011635283, -0.045360684, 0.029589145, 0.060529523, -0.007849173, 0.01426036, 0.04985919, -0.008824085, 0.036749367, 0.044685677, -0.0011817213, 0.06049385, -0.04117337, 0.010569087, 0.02383583, 0.011132032, -0.0130001865, -0.03298917, 0.002446824, 0.0045000166, -0.04499439, 0.042472005, -0.026924774, -0.05432365, -0.01979243, 0.00091396837, 0.09272902, -0.020768762, -0.0019545692, -0.021573652, 0.02436971, -0.044088252, -0.018922534, 0.024210745, 0.030991621, 0.03997965, -0.0434378, 0.04995531, -0.0039228452, -0.0215597, -0.02321799, 0.008286333, 0.01741183, -0.02333986, 0.022252202, 0.0049668783, -0.004229103, 0.03743882, -0.03715728, -0.034756232, -0.06794591, 0.042537566, 0.029796721, 0.011262443, -0.010262385, -0.03692401, -0.016014267, 0.017666286, -0.02509373, 0.0281192, 0.027945144, -0.02959435, -0.034066536, -0.017607085, 0.07592548, 0.018440431, -0.020126548, -0.027609, -0.0048741517, 0.04447803, -0.065523185, -0.04672456, -0.008673691, -0.020518249, 0.030257948, 0.0068379645, -0.017666688, 0.008509258, 0.023115408, -0.026459849, 0.026117751, 0.028005814, 0.003908815, 0.057433505, 0.024807585, -0.004046096, 0.0017462536, 0.0077662203, -0.050342854, -0.04287692, 0.0013275621, -0.50064987, -0.015097846, 0.000350904, 0.025022822, -0.027239416, -0.008690115, 0.08565216, 0.018583473, 0.012066793, 0.013850584, -0.00844474, 0.031463075, 0.026794313, 0.026180752, -0.0018213276, 0.022180885, 0.01604574, 0.01485354, -0.01610846, 0.013473871, 0.020979878, -0.022703156, -0.02954484, 0.011266594, 0.03898503, -0.012073051, -0.0103193605, 0.010020884, -0.023557615, 0.019898476, 0.012273828, 0.00834069, -0.027494282, -0.008948237, -0.003616727, 0.01575049, 0.008528816, 0.009580385, 0.026152095, -0.013435341, 0.0109673925, 0.025782071, 0.01776075, 0.009053147, 0.010686469, -0.016122812, 0.025775248, -0.016045403, -0.03223995, 0.05115726, 0.039661348, -0.02582235, 0.03671598, 0.027748164, 0.023397474, -0.009546225, 0.020773243, -0.0015611204, -0.03785442, -0.0074101216, 0.036606133, -0.012366875, -0.0043544853, -0.022159895, 0.02244062, -0.0047655664, -0.06390347, -0.09652538, 0.022665162, -0.0343743, -0.066406116, 0.015538418, -0.021813251, -0.064692214, 0.07173882, -0.0029577285, -0.057316057, 0.004651331, 0.037256103, -0.06098337, -0.028027106, -0.06439224, 0.0012678342, -0.003990492, 0.003779248, -0.07493796, -0.002655993, -0.026528886, -0.053724967, 0.021634642, 0.040155597, -0.03754342, 0.01633979, 0.0048994203, 0.05381415, 0.073855974, 0.020877184, -0.017708246, 0.036976, 0.0069037643, 0.039607946, -0.008933261, -0.00027300982, -0.013201155, 0.039523862, 0.008824607, -0.017681193, 0.0153607335, 0.042257935, -0.073968045, -0.023477735, -0.006020762, -0.059672326, 0.013251288, 0.028822098, 0.016229203, -0.012250663, 0.010808848, 0.019177752, 0.016294422, 0.006332768, 0.022233747, 0.013640989, 0.03949157, 0.042287223, -0.007917068, -0.018228425, 0.0006389648, 0.029003762, 0.016339244, 0.032809723, -0.024170708, 0.011794351, -0.020221373, 0.040728714, -0.03966438, 0.015890134, -0.009914543, -0.0018150231, -0.03726423, -0.02429148, -0.012575232, -0.0011641289, -0.00027489042, -0.0068506887, -0.011546178, -0.006803243, -0.0005834396, -0.0027096842, 0.021232966, 0.005172306, -0.01738395, 0.034679517, -0.011630665, -0.031114325, 0.011505026, 0.011877191, 0.022943249, -0.010905956, -0.0077171153, 0.023419175, -0.0456046, -0.09583929, 0.013822923, 0.01695847, 0.010467115, 0.023308776, -0.02715588, -0.020159712, 0.027452687, 0.0050318884, 0.03545499, -0.059619024, -0.030303221, 0.0026993107, -0.01284604, -0.007246384, 0.008606249, -0.002563243, 0.004827213, -0.0017868602, -0.0074855974, 0.030366743, 0.008560143, 0.021153444, -0.052245487, 0.03639631, -0.034826104, 0.0100980885, -0.08043573, 0.047467787, 0.040591102, 0.027638238, -0.013704323, -0.022573268, -0.017826084, 0.021062123, 0.06588612, -0.02480113, 0.021635212, -0.04539788, 0.030434962, -0.030133616, 0.027237197, 0.023543773, -0.04263587, 0.031617526, -0.006153241, -0.018192949, -0.014417815, 0.016551504, -0.032725073, -0.025185658, -0.013599601, -0.023914553, -0.01779092, -0.032188226, -0.010665772, -0.05702084, 0.0032707402, -0.019057233, -0.03841082, -0.0074850307, -0.012283355, -0.017292693, 0.013030961, 0.015075497, -0.048814576, -0.010872971, -0.013110308, 0.026944032, 0.023614813, 0.035295796, 0.059366867, -0.06851462, -0.007112913, -0.04911203, -0.004463656, -0.0064244987, 0.03062979, -0.030771893, -0.011049232, 0.0029938892, -0.051478557, -0.03562367, 0.06218931, -0.011535792, -0.019502563, -0.024541138, -0.015967252, 0.026428893, -0.025097331, 0.027554166, -0.03859047, 0.0034164158, -0.0070795077, -0.016233113, -0.025465267, -0.006447348, 0.012361808, 0.013738633, 0.0067575886, -0.05470945, -0.022781696, 0.013595963, -0.0054904576, -0.006264475, -0.06497549, -0.0028948118, -0.026298085, -0.06496579, -0.0032220902, 0.01747098, 0.015902916, 0.008199153, -0.04886416, -0.053374868, -0.00972378, 0.00964476, 0.004777738, 0.0112977065, 0.014537011, -0.03755189, 0.0091431225, 0.03715281, 0.003841176, 0.0146556785, 0.0047617746, -0.006074232, 0.016759083, -0.00450006, 0.08253157, -0.03801384, -0.0013293328, 0.018730186, 0.023054121, -0.0022610726, -0.0033345665, 0.0012067712, -0.058625318, -0.04085329, 0.05468864, 0.048731983, -4.4664685e-05, 0.034622654, 0.017969657, 0.002967615, -0.0075284345, 0.002347332, 0.039180238, 0.01465807, 0.007850371, 0.03737975, 0.071476355, -0.016148664, 0.053029854, 0.034084387, -0.050818127, 0.031127132, 0.023425598, 0.022097934, 0.0008291642, 0.018513078, -0.0015906874, -0.06991005, 0.025762914, -0.037214287, 0.03299773, 0.012754739, 0.030961921, 0.04684349, 0.0599751, -0.004548468, -0.035331372, 0.039082702, -0.009068897, 0.027803939, 0.003522049, -0.032195624, 0.002358096, 0.066283956, 0.03533211, -0.027552038, 0.0471088, 0.007841811, -0.007014528, 0.018560728, 0.037866414, -0.047416784, 0.029452348, 0.001017741, 0.018671565, -0.023846393, -0.042155504, -0.026011437, -0.01702608, 0.027721513, -0.01584316, -0.020768164, -0.021176951, 0.028337715, 0.018456224, -0.03961752, 0.0013031506, -0.011343902, 0.0016860898, 0.030346787, 0.02848123, 0.017923767, 0.020412719, -0.055250436, 0.0038194084, -0.010683537, 0.03435397, -0.0072010467, -0.047911823, 0.03807371, -0.0230669, -0.009775123, 0.026547365, 0.019389603, -0.0034204898, -0.027245397, -0.0056225527, 0.005122604, 0.042448904, -0.0013998877, -0.0053178472, -0.011033006, -0.017208336, -0.0091754, 0.0066734413, -0.023320239, 0.042030074, -0.008663486, -0.011522756, 0.025215449, 0.059407484, 0.029597294, 0.0045785946, -0.0028726438, 0.0062745675, 0.013162211, 0.07589094, -0.02303782, -0.0038956434, -0.050218705, -0.014999147, -0.086132616, -0.01943652, 0.029623754, 0.040233303, -0.0075672944, 0.011764935, -0.0064229514, -0.0031745753, 0.0053034783, -0.020641588, 0.0029871, -0.015542175, 0.016057365, -0.033887934, 0.039103054, 0.0033535827, 0.000710233, -0.045190632, -0.021804998, -0.010477706, -0.029470801, 0.00022633243, -0.0021377406, -0.028552316, -0.019209176, 0.03712851, -0.008609349, 0.01355697, -0.0018778712, 0.025276061, 0.0338542, 0.0074077183, -0.066537805, -0.035244044, 0.03448942, 0.017167354, -0.03824826, 0.013875755, -0.041446164, 0.0058256406, -0.028005881, -0.00042783818, -0.0016258132, -0.0003863654, -0.031013453, -0.010352486, 0.024635406, -0.011163647, -0.024019025, -0.03593331, 0.01443957, 0.022958992};
        double[] arr2 = {0.0012885748, -0.016638879, 0.05263873, 0.0081952475, -0.00802399, 0.006312027, -0.008666632, -0.002185755, -0.0106334025, -0.061216284, -0.025810493, 0.03992124, -0.02726522, 0.019349204, -0.0054606264, 0.030214107, -0.005916795, 0.046324357, 0.00049181964, -0.07602332, -0.0051725106, -0.043034803, -0.0016064744, -0.0374005, 0.016281236, -0.03822163, -0.0033694361, 0.030857982, -0.029246185, -0.017512688, -0.043753054, 0.019508706, -0.025962386, -0.03837613, -0.013544022, -0.018652393, -0.015610022, 0.009460089, 0.019477924, -0.01788009, -0.026758194, -0.0348642, 0.0051322817, -0.004674659, 0.010568437, -0.04167638, -0.13015692, 0.0062333927, -0.045718826, -0.034199625, -0.012828993, 0.041126557, 0.06722059, 0.025844632, -0.038198184, 0.041662067, -0.009236844, -0.003386948, 0.030821001, 0.016836608, 0.01033961, -0.04603454, -0.02819907, 0.041887842, -0.012397797, 0.01974935, -0.0073591364, 0.025483022, -0.009755228, -0.015468664, 0.018798228, 0.0004731569, 0.040809806, -0.0111492025, -0.027680377, 0.020228375, -0.015401153, 0.008085237, 0.04197643, 0.0074740876, 0.022366852, 0.0007270239, 0.03117394, -0.009338366, 0.017011322, 0.032113902, 0.006876461, 0.00792507, -0.04117589, 0.026943997, 0.023923663, -0.01394315, 0.0043753344, 0.03843972, 0.022831403, 0.0071993093, -0.04281804, 0.008996372, 0.016729917, 0.026837409, -0.059394997, 0.04694058, 0.01989581, 0.020542318, -0.033900935, -0.016649239, -0.0726951, -0.04456952, 0.0071340012, 0.009467049, -0.015890643, 0.006587467, -0.009483619, -0.012743031, -0.033495784, 0.0041724658, 0.00017295072, -0.035748146, -0.011216707, 0.00039436913, -0.009349086, 0.091490746, 0.023718806, 0.029219178, -0.008514497, 0.018388297, 0.06597226, 0.036732495, 0.028769864, 0.012801986, -0.008577867, 0.06251925, 0.01820723, 0.009907996, 0.04214278, -0.04869676, 0.0067370175, 0.015300375, 0.0070004566, -0.03543024, -0.029676158, -0.04268504, -0.06234029, -0.0036037483, 0.014867976, -0.005936, -0.06493262, -0.028788872, -0.042329237, 0.038640656, -0.0031270306, 0.01661951, -0.016203992, 0.0066131274, -0.015010232, 0.051735904, -0.005908992, -0.022866383, 0.026507732, 0.0195904, 0.010275197, 0.061288532, -0.028518029, 0.011398728, -0.0046497122, -0.08125628, 0.020282153, 0.0556066, -0.010166193, -0.009200528, -0.019680308, -0.0054987934, -0.007755758, -0.015492321, -0.0012411014, 0.06404058, 0.06956386, 0.026403757, 0.0259916, 0.0036432822, -0.034716178, 0.023698164, 0.028842364, -0.044520188, 0.011521864, 0.013900755, 0.045527834, 0.026637802, 0.04000893, -0.012419425, -0.034800366, -0.024745483, 0.004256277, -0.051517047, 0.06707132, -0.012167924, -0.033388574, 0.05849258, 0.033960767, 0.011982807, -0.0045676036, 0.0019376437, 0.044613853, -0.031366784, -0.021776605, 0.008744188, -0.0048170113, -0.031813867, -0.03717458, 0.020784168, -0.009270373, 0.028975343, 0.021269066, -0.029296618, 0.039867077, 0.0046318527, -0.027327446, -0.04397601, 0.019425869, -0.021760678, 0.024808621, -0.036201354, -0.0038338718, 0.05930356, -0.04265246, 0.034686297, 0.04142513, 0.013242579, 0.054881584, -0.060468704, -0.011861014, 0.015280844, -0.001761665, -0.003387863, 0.00883252, 0.0038225048, 0.02977529, 0.0053848224, 0.043342035, -0.009711955, 0.03215476, 0.031213326, 0.023014462, 0.0040029716, -0.015276727, -0.009182547, 0.009754216, 0.029543106, -0.030514568, -0.038799424, 0.058677267, 0.008063923, -0.013521663, -0.03104765, 0.023834527, -0.03156199, -0.003062578, -0.018493047, -0.026190026, 0.031999413, 0.02050151, 0.004946712, -0.013298916, 0.021327175, 0.02144721, -0.036204938, -0.0420639, -0.049581736, 0.050397877, 0.013741171, -0.013971812, 0.022454372, 0.016714914, -0.043826148, -0.010964559, -0.028211623, 0.04467552, 0.03200121, -0.03148693, -0.033436332, 0.034998912, 0.005540593, 0.033108372, 0.014233186, -0.019747332, -0.04676718, -0.012147705, -0.03563996, -0.051602874, -0.028722253, -0.033112116, 0.03597863, -0.014650171, 0.016971318, -0.010255595, 0.02701234, -0.007874085, 0.020811234, -0.017776744, -0.018096983, -0.019181833, -0.026058557, -0.029285556, -0.07283326, -0.0245487, -0.025348006, -0.025702292, -0.011627998, -0.5266817, 0.026033368, -0.039669607, -0.0013688285, -0.045219924, -0.0428379, 0.07276464, -0.0040552258, 0.01636768, -0.00010274482, -0.01317245, 0.012858867, -0.012077548, 0.016941976, -0.0015842562, 0.058868863, 0.047894865, 0.03773607, 0.012761863, 0.041356638, -0.03783054, 0.004682918, -0.0040544043, 0.00050488143, 0.05009955, 0.005533244, -0.04750912, 0.012494006, -0.013950832, 0.0067058243, -0.019064834, -0.020786889, 0.0029380948, 0.04511339, -0.012300082, -0.0009289996, 0.05360984, 0.035917584, 0.022287417, -0.039109737, 0.039638598, 0.03526135, -0.03302908, 0.015018457, 0.030460114, -0.0076055336, 0.012394207, 0.0035891023, 0.0035225197, 0.057845175, -0.014733311, -0.03530511, 0.027875341, 0.03185146, 0.0011375517, -0.027764585, 0.033173133, 0.014570227, -0.019645778, -0.0113456985, 0.021899363, -0.06441435, -0.00449012, -0.06258454, -0.021054206, 0.01163491, -0.022878457, 0.00523385, 0.037382975, 0.027321776, 0.0050433083, 0.029411132, 0.0071275025, -0.06418862, 0.028265456, -0.03290798, 0.01905578, 0.0041036876, -0.02636978, 0.00012886334, -0.026943484, -0.060725853, 0.026849378, 0.022444058, -0.012326138, -0.046461735, 0.026696684, -0.030419538, 0.015258102, 0.021193914, 0.049021117, -0.052100357, 0.008680178, 0.015226869, 0.026484326, 0.018812843, 0.0779555, -0.026921475, 0.019849172, -0.021078149, 0.050776612, -0.007381719, -0.020754112, -0.060326867, 0.00071720855, -0.0034815166, 0.0036643879, 0.01726319, 0.074206986, 0.010956608, 0.0004937691, 0.021152003, -0.039490312, -0.019554319, 0.0165118, -0.019767873, 0.0026817394, 0.023982795, 0.037642512, -0.04565563, 0.0032091355, 0.00885276, -0.054219645, 0.0014641586, 0.01610961, 0.018952796, -0.0015423723, 0.04088158, -0.05568291, -0.0017977273, 0.00032264227, 0.0062456834, 0.009929903, -0.010998022, 0.035515822, -0.07646108, 0.0013366753, -0.012158291, 0.03292752, -0.036401346, -0.0008458884, 0.02232944, -0.030495593, 0.01081236, 0.0071811066, 0.036628988, -0.010667429, -0.020820782, -0.042413358, -0.015475712, -0.0040417393, -0.059663747, -0.0002555293, 0.01614262, -0.03511039, -0.021445777, -0.028892621, -0.027504295, 0.015384785, -0.022568382, 0.04885303, 0.0002685419, -0.08105264, 0.017800558, 0.00028178305, -0.02454767, -0.021001656, -0.014600629, -0.03494225, 0.024349902, -0.04047418, 0.0022504742, -0.028865255, -0.04461265, 0.007734054, -0.018104203, 0.04732435, 0.026274137, 0.03818735, 0.02364734, 0.013840666, 0.00078311365, -0.025724003, 0.027390376, 0.018114448, 0.0055243354, -0.00353227, 0.030387076, -0.014877548, 0.01958786, 0.024479404, 0.051935535, 0.01484512, -0.0118199745, -0.042096637, -0.05779775, -0.021542491, 0.058919128, 0.015269935, -0.039572656, -0.0047704936, 0.026373645, -0.022419196, 0.0778419, -0.044319414, 0.0020558666, 0.022118842, 0.008020583, -0.019989753, -0.03490642, 0.0065444163, -0.03834203, -0.037233695, 0.012171402, -0.0071523255, 0.00584155, 0.012234419, -0.021701133, 0.038373414, -0.05432597, 0.013339954, -0.025356062, -0.04103984, 0.0661416, -0.006746408, 0.008807447, 0.051162925, -0.030219838, 0.026418695, 0.0016886414, 0.036920596, -0.0032500539, -0.0011050898, 0.03554326, -0.037478473, -0.0077384193, -0.044458427, 0.01259757, 0.037352506, -0.033219293, 0.026566617, 0.0562118, -0.038474035, -0.0043265084, -0.018968118, 0.04405018, -0.0023538317, -0.02288085, -0.041781463, 0.03584819, -0.011751326, -0.019991813, -0.019605855, -0.009962824, 0.055791594, 0.009925968, -0.006901592, -0.023459021, -0.03828536, 0.055945925, 0.014601685, -0.006716915, -0.02087885, 0.0024459478, 0.03793723, 0.056221582, -0.026123067, 0.0015310739, -0.0075883493, -0.039862584, -0.030701477, 0.006377457, -0.0045664622, 0.06489156, 0.008214586, -0.0011654524, -0.0125158345, 0.039477773, 0.01062634, 0.0027780402, 0.014265556, -0.051923875, -0.019969318, 0.0078744395, 0.021913445, 0.005673973, 0.028255997, 0.021001741, -0.017339345, 0.025080629, -0.014841151, 0.06615927, -0.019039633, -0.006165666, 0.021207416, 0.021086406, 0.048435196, -0.018539604, 0.005391163, -0.05184308, -0.013636709, 0.06527382, 0.07335564, -0.051276114, 0.06457608, -0.037213713, 0.0013970784, 0.008988442, -0.013177189, 0.010169647, 0.027004167, 0.034401283, 0.017161127, 0.026116967, -0.028461572, -0.0028389087, 0.02002002, -0.0013278276, 0.034651686, -0.018260086, 0.00081100373, 0.017999314, 0.00374654, -0.020226367, -0.057894688, 0.024901956, -0.027784077, 0.02835009, 0.036897436, -0.029205369, 0.02757591, 0.04806928, -0.052032154, 0.042826526, -0.014843608, -0.036915533, -0.022903556, -0.03952396, -0.041525293, 0.013450733, 0.056460243, 0.046500582, -0.0030124309, 0.01762426, -0.015951116, 0.013806034, -0.023852434, -0.009324906, 0.016418267, 0.027371857, -0.014652834, -0.010434928, 0.009551823, 0.016908836, -0.037695065, -0.037331752, 0.0374045, 0.0189868, -0.0280902, -0.023344321, -0.010489406, 0.06529498, -0.014894894, -0.006265838, -0.00941538, -0.022978866, 0.048025586, 0.020801688, 0.009393668, 0.0120089585, 0.024078105, 0.04860836, 0.007350233, 0.016057165, 0.0018979425, -0.048476662, 0.0025482255, 0.027195124, -0.013012825, 0.019957215, -0.0051842444, 0.03731853, 0.006288282, 0.0022358324, 0.016525775, -0.0006031588, -0.03917159, 0.02582084, 0.019015357, -0.028638374, 0.009054299, -0.026735496, 0.011502092, -0.003737962, -0.03075383, 0.023918476, -0.01758445, 0.052036397, 0.037617266, 0.014365422, 0.0022160788, 0.030637233, -0.018464254, 0.0066377535, -0.0050110077, 0.022255285, -0.05056311, 0.005410361, -0.039897077, 0.025529241, 0.039390884, -0.012343311, -0.00579509, 0.0006081242, -0.0334094, 0.02204093, 0.038002793, -0.033213288, 0.0015292423, -0.053843208, -0.054018237, -0.046116143, 0.023183051, -0.024464056, 0.008989075, 0.0076109427, -0.014980239, 0.041750375, -0.0058123916, 0.021533702, -0.006396632, -0.0023915528, -0.03629091, 0.0352598, -0.008954429, -0.0156042455, -0.046334397, 0.037941553, 0.037494857, -0.03391854, -0.05507631, -0.01957496, -0.035781212, 0.020248763, -0.056394998, 0.00800166, -0.02889756, -0.02318854, -0.07266651, 0.0029435146, 0.007539782, -0.006993222, -0.010195533, -0.046668656, -0.050472178, -0.0044126534, 0.023163289, -0.033716492, 0.026385805, 0.0020954325};
        System.out.println(arr.length);
        System.out.println(arr1.length);
        System.out.println(arr2.length);

    }

    public static MilvusServiceClient getClient(){
        final MilvusServiceClient milvusClient = new MilvusServiceClient(
                ConnectParam.newBuilder()
                        .withUri("http://10.10.12.117:19530")
                        .withToken("root:Milvus")
                        .build()
        );
        return milvusClient;
    }
}
