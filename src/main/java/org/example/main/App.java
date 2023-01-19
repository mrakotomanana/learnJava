package org.example.main;


import javax.script.ScriptException;
import java.text.ParseException;
import java.util.regex.Pattern;

public class App {
    private static final Pattern RAW_DELIVERY_PATTERN = Pattern.compile("<span>(.+)</span>");
    public int value;
    public static String otherValue;
    public final String testFinal;


    public App() {
        this.testFinal = "testFinal";
        System.out.println("app construct");
    }

    public static void main(String[] args) throws ParseException, ScriptException {

        /* To solve it, we can use this maven-shade-plugin to create an uber/fat-jar – group everything into a single jar file. */
//        BigDecimal salary = new BigDecimal(900);
//        Person person = new Person("mkyong", 40, salary);
//        System.out.println("bébé".toUpperCase(Locale.ROOT).toLowerCase(Locale.ROOT));
//        System.out.println(DigestUtils.sha256("test"));
//        System.out.println(MathUtils.sum(12,3));
//        String test = "<span>test écse çaà \" sert 02 jours</span>bne";
//        Matcher matcher = RAW_DELIVERY_PATTERN.matcher(test);
//        if (matcher.find()) {
//            System.out.println("misi :: " + matcher.group(1));
//        } else {
//            System.out.println("tsi misi");
//        }
//        System.out.println("\u00e0");
//        LocalDate now = LocalDate.now();
//        LocalDate end = LocalDate.parse("2022-04-15");
//        Period period = Period.between(now, end);
//        Collator collator = Collator.getInstance(Locale.FRANCE);
//
//        System.out.println(period);
//        double a = (63-2)/(double) 10.0;
//        String title = "Einfacher, aber solider Monitor für den Office-Standard. Das Preisleistungsverhältnis geht hier absolut in Ordnung. Schade, dass das HDMI-Kabel nicht zum Lieferumfang gehört.";
//        title = StringUtils.substring(title, 0, 39);
//        System.out.println(StringUtils.substringBeforeLast(title, " "));
//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//        filtered.forEach(CsvTest::afficher);
//        Class<App> test = App.class;
//        System.out.println(Arrays.toString(test.getFields()));
//        App testApp = new App();
//        App.otherValue = "10";
//        String texte =  "un - deux - trois - quatre FIN" ;
//
//        Pattern p = Pattern.compile("-") ;
//        Matcher m = p.matcher(texte) ;
//
//        StringBuffer sb =  new StringBuffer() ;
//        int i =  1 ;
//        while (m.find()) {
//            m.appendReplacement(sb,  "[" + i++ +  "]") ;
//            System.out.println(sb);
//        }
//        m.appendTail(sb) ; // tsi maints manao an'ito appendTail ito mb angalana ireo text farani
//        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("dd MMMM yyyy");
//        LocalDate localDate = LocalDate.parse("22 avril 2022", dateTimeFormatter);
//        System.out.println(localDate);
//        ApplicationContext appCtx = new GenericXmlApplicationContext("context.xml");
//        Date now = appCtx.getBean("now", Date.class);
//        System.out.println(now);

//        now = appCtx.getBean("nom", Date.class);
//        System.out.println(now);


//        BigDecimal ans = new BigDecimal(8.72057E+12);
//        Double ans = Double.valueOf("8.72057E+12");
//        System.out.println(ans); //This prints 123

//        DecimalFormat df = new DecimalFormat();
//        Number num = df.parse("8.72057E+12", new ParsePosition(0));
//        double ans = num.doubleValue();
//        System.out.println(ans); //This prints 123
//        String maTasse = "{@couleur: Rouge, type : 5}";
//        JSONObject tasse = new JSONObject(maTasse);
//        System.out.println(tasse.get("@couleur")); //Rouge
//        try {
//            URL url = new URL("https://www.e.leclerc/cat/nos-pc-equipes-de-windows?code=NAVIGATION_nos-pc-equipes-de-windows&page=2#state_code=11");
//            System.out.println(url);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//        String germanString = "Entwickeln Sie mit Vergnügen";
//        byte[] germanBytes = germanString.getBytes();
//
//        String asciiEncodedString = new String(germanBytes, StandardCharsets.US_ASCII);
//
//        System.out.println(asciiEncodedString);
//        System.out.println(germanString);
//        String html = "<p><a href='http://example.com/'"
//                +" onclick='checkData()'>Link</a></p>";
//
//        System.out.println("Initial HTML: " + html);
//        String safeHtml =  Jsoup.clean(html, Whitelist.basic());
//        System.out.println("Cleaned HTML: " +safeHtml);

        // create a script engine manager
//        ScriptEngineManager factory = new ScriptEngineManager();
        // create a JavaScript engine
//        ScriptEngine engine = factory.getEngineByName("JavaScript");
        // evaluate JavaScript code from String
//        engine.eval("print(3+6)");

//        ScriptEngineManager manager = new ScriptEngineManager();
//        List<ScriptEngineFactory> factories = manager.getEngineFactories();
//
//        for (ScriptEngineFactory factory : factories) {
//            System.out.println("Name : " + factory.getEngineName());
//            System.out.println("Version : " + factory.getEngineVersion());
//            System.out.println("Language name : " + factory.getLanguageName());
//            System.out.println("Language version : " + factory.getLanguageVersion());
//            System.out.println("Extensions : " + factory.getExtensions());
//            System.out.println("Mime types : " + factory.getMimeTypes());
//            System.out.println("Names : " + factory.getNames());
//        }

        System.out.println(System.getProperty("os.name"));
    }

    public void testAfficher() {
        System.out.println("afficher");
    }
}