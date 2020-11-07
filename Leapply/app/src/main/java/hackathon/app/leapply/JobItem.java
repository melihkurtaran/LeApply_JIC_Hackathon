package hackathon.app.leapply;

//Created by Melih Kurtaran

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class JobItem implements Serializable {

    private int id;
    private String title;
    private String company;
    private String location;
    private int imageID;
    private String detail;
    private String applyLink;
    private String learnLink;

    public JobItem(int id, String title, String company, String location, int imageID, String detail, String applyLink, String learnLink) {
        this.id = id;
        this.title = title;
        this.company = company;
        this.location = location;
        this.imageID = imageID;
        this.detail = detail;
        this.applyLink = applyLink;
        this.learnLink = learnLink;
    }

    public JobItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getApplyLink() {
        return applyLink;
    }

    public void setApplyLink(String applyLink) {
        this.applyLink = applyLink;
    }

    public String getLearnLink() {
        return learnLink;
    }

    public void setLearnLink(String learnLink) {
        this.learnLink = learnLink;
    }

    public static List<JobItem> getAllJobs(){

        String turkcellDetail = "We are looking for a C++ Developer having the following qualifications to be employed in our company.\n" +
                "\n" +
                "\n" +
                "BSc degree in Computer Engineering from a reputable university\n" +
                "Experience and good knowledge in C++ software programming languages. \n" +
                "Experience and knowledge in Linux applications\n" +
                "Experience in Image Processing\n" +
                "Good knowledge in data preparation, classification, model training and testing in Machine Learning / Deep Learning\n" +
                "Eager to learn new technologies\n" +
                "Good team player, result oriented attitude and analytical mind\n" +
                "Strong communicational and interpersonal skills\n" +
                "High energy and drive";

        String microsoftDetail = "Forza is a gaming franchise that has come to represent a passion for cars, a community centered around competition and creativity, and the opportunity to connect and immerse players. Our vision is to grow Forza into the top automotive entertainment brand in the world. This is a unique opportunity to help accelerate player engagement and drive growth across our IPs that span mobile, console, and PC.\n" +
                "\n" +
                " \n" +
                "\n" +
                "We are seeking an ambitious, creative, and collaborative self-starter with superb communication skills and a passion for achieving high impact, high quality results. Other competencies required include the ability to define clear goals, develop thoughtful, creative marketing strategies that are grounded in a deep understanding of our community of players. As a games product marketing manager at Xbox, you will partner closely with Studio teams at Turn 10 and Playground Games to build and manage live marketing campaigns for gaming communities across mobile, console, and PC. You do not need to be a racing expert to succeed in this unique and fun role – though you may become one!\n" +
                "\n" +
                "Responsibilities\n" +
                "Design and execute go-to-market campaigns from the ground up via best-in-class marketing assets and multi-channel executions\n" +
                "Drive integrated cross-channel campaigns across email, web, social, and performance marketing channels\n" +
                "Define and manage visual identity for global marketing materials (digital merchandising, branding, advertising creative, product pages)\n" +
                "Land asset placement and co-marketing with major partners, such as Apple, Google, Samsung, Windows, and others to showcase new content offerings across app store channels\n" +
                "Collaborate with global marketing, channel, partner, social, platform, and PR teams to integrate game content into franchise campaigns and Xbox events\n" +
                "Analyze key performance indicators and share insights from competitors, current trends, and community interests to inform decision-making\n" +
                "Optimize product description pages with ASO and SEO research, testing, and implementation\n" +
                "Partner with product, business, and franchise management teams to set forecast, budget, and lifecycle planning\n" +
                " \n" +
                "\n" +
                "\n" +
                "Qualifications\n" +
                " \n" +
                "\n" +
                "Go-to-market campaigns from the ground up via best-in-class marketing assets and multi-channel executions\n" +
                "2+ years proven expertise in creating, owning, and executing on go-to-market plans for consumer products (games or entertainment industry preferred) agency or in-house across creative development, media planning, CRM, PR, partnerships, and events\n" +
                "Experience driving always-on, performance marketing campaigns\n" +
                "Experience with Mobile Marketing\n" +
                "solid knowledge of SEO, keyword research, and Google Analytics\n" +
                "Ability to manage across all levels, both horizontally and vertically\n" +
                "Excellent interpersonal, networking, and relationship management skills\n" +
                "Proactive and able to run complex projects on time with great organizational skills\n" +
                "Excellent verbal and written communication, presentation skills, and executive presence\n" +
                "Creative thinker who can develop out-of-the-box ideas\n" +
                "Comfortable when faced with ambiguity.";

        String peakDetail = "Job Description\n" +
                "We are looking for a Game Developer to join our Engineering Team. Together with your team you will be crafting code that brings to life game features, items and levels in our games which are enjoyed by a community of 40 million active users each month. This scale comes along with very interesting engineering challenges which we are solving together, using a technology-agnostic approach. Alongside with our game we are growing as software engineers and as a team.\n" +
                "\n" +
                "Here’s what you will be doing\n" +
                "Build an amazing experience for the millions of users who play every day\n" +
                "Design, implement, test and maintain our casual gaming products\n" +
                "Write clean, sustainable code and participate in peer code-reviews\n" +
                "You will have ownership of a primary work stream, which you will own end-to-end, but work in close collaboration with your fellow mobile engineers\n" +
                "Brainstorm new ideas together with your team to continually iterate and improve user experience of our games\n" +
                "Desired skills and experiences\n" +
                "University degree in Computer Science or any equivalent department\n" +
                "There’s no need to have prior game development experience. If you are a good engineer and value a holistic and technology-agnostic approach to software engineering, we’d like to hear from you\n" +
                "Areas in which you'll continue to grow\n" +
                "Developing, releasing and maintaining high quality code\n" +
                "Strong engineering skills and programming fundamentals\n" +
                "Good command of various programming languages (such as C#, Java) and experience on best practices and idioms of these languages\n" +
                "Software architecture design, OOP and design patterns principles on various scales";

        String unileverDetail = "Responsibilities\n" +
                "Unilever is one of the world’s leading suppliers of fast moving consumer goods with operations in over 100 countries and sales in 190. Consumers buy 170 billion Unilever packs around the world every year, and our products are used over two billion times a day. We have more than 171,000 employees globally; (11,000 in the United States) and generated annual sales of €46.5 billion in 2011. Working to create a better future every day, we help people feel good, look good and get more out of life with brands and services that are good for them and good for others. Our portfolio includes some of the world’s best known and most loved brands including thirteen €1 billion brands, and global leadership in most categories in which we operate.\n" +
                "\n" +
                "In the United States the portfolio includes brand icons such as: Axe, Ben & Jerry’s, Bertolli, Breyers, Caress, Clear Scalp & Hair Therapy, Consort For Men, Country Crock, Degree, Dove personal care products, fds, Good Humor, Hellmann’s, I Can’t Believe It’s Not Butter!, Just for Me!, Klondike, Knorr, Lever 2000, Lipton, Magnum, Motions, Nexxus, Noxzema, Pond’s, Popsicle, Promise, Q-tips, Ragú, Simple, Skippy, Slim-Fast, Soft & Beautiful, St. Ives, Suave, tcb, TIGI, TRESemmé, Vaseline, and Wish-Bone.\n" +
                "\n" +
                "Unilever’s ambition is to double the size of our business, whilst reducing our overall environmental impact (including sourcing, consumer use and disposal). We are also committed to doing what we can to improve health, nutrition and hygiene, with a target to help more than a billion people take action to improve their health and well-being, as well as sourcing all our agricultural raw materials sustainably by 2020. All of these goals are itemised in around 60 time-based commitments in our Unilever Sustainable Living Plan.\n" +
                "\n" +
                "Unilever has led the Food Producers sector in the Dow Jones Sustainability World Indexes for 13 consecutive years. We are included in the FTSE4Good Index Series and attained a top environmental score of 5, leading to inclusion in the FTSE4Good Environmental Leaders Europe 40 Index. In 2011 Unilever led the Climate Counts Company Scorecard and was named #1 in the list of Global Corporate Sustainability Leaders according to the latest survey findings from GlobeScan Inc. and SustainAbility Ltd.\n" +
                "\n" +
                "For more information about Unilever and its brands, please visitwww.unilever.com.\n" +
                "\n" +
                "HUMAN RESOURCES INTERNSHIP OVERVIEW:\n" +
                "\n" +
                "Unilever is looking for energetic and passionate HR students to assist and provide support to our Human Resource Business Partners (HRBP’s), as well as to our greater HR team. This may incorporate experiences in core HR areas such as compensation, learning, talent management & diversity. HR summer assignments may include projects requiring research analysis, benchmarking, assisting in the development of communication/ media correspondence and solution implementation related to HR initiatives. At the beginning of the summer, each intern is assigned a key project to ‘own’ that incorporates many of the job responsibilities and skill sets of a Human Resources Specialist, the entry-level full-time position in Human Resources. Skill sets utilized and further developed during the Summer Internship include presentation skills, team working, leadership, analytics, and building insights into action.\n" +
                "\n" +
                "Qualifications\n" +
                "QUALIFICATIONS:\n" +
                "\n" +
                "Current College Sophomore/ Junior level pursuing Bachelor’s degree in Human Resources, Organizational Development, Business Degree or related field\n" +
                "The ideal candidate will possess strong team and analytical skills; strategic thinking skills; leadership ability; initiative and enthusiasm for work in an unstructured environment; the ability to communicate effectively, especially as part of a team.\n" +
                "Must be proactive and self-driven and possess the ability to multi-task\n" +
                "Strong PC skills in the following programs: Word Excel, PowerPoint, & Peoplesoft (a plus but not required)";

        String ericsondetail = "As the tech firm that created the mobile world, and with more than 54,000 patents to our name, we’ve made it our business to make a mark. When joining our team at Ericsson you are empowered to learn, lead and perform at your best, shaping the future of technology. This is a place where you're welcomed as your own perfectly unique self, and celebrated for the skills, talent, and perspective you bring to the team. Are you in?\n" +
                "\n" +
                "Come, and be where it begins.\n" +
                "\n" +
                "Our Exciting Opportunity:\n" +
                "\n" +
                "IPR & Licensing is Ericsson’s global unit managing and commercializing Ericsson’s patent portfolio. The business contributed SEK 9.6 b. in net licensing revenue 2019 through a mix of bilateral patent cross-licensing and more structured transactions and business models to monetize patents. We are now looking for a Business Case Analyst to work closely with the Pricing and FRAND compliance function, developing pricing strategies and modelling business cases in the patent licensing context.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Operationally the position will report to the Head of Business Management & Finance in Kista but hosted and advised in day to day activities by the Head of Pricing and FRAND compliance in Plano. IPR & Licensing Business Management & Finance is a small diverse team working across Business Control, Business Development, Transaction Management, Contract Management, Commercial Support and M&A IPR support, executing quick business decisions mixed with complex business transactions with significant overlap between strategy, business development, execution and controlling roles in day to day activities.\n" +
                "\n" +
                " \n" +
                "\n" +
                "In this role you will:\n" +
                "\n" +
                "Model business cases for patent licenses\n" +
                "\n" +
                "Participate in projects in the Pricing and Business Management units and across IPR&Licensing as applicable\n" +
                "\n" +
                "Develop and improve tools and models\n" +
                "\n" +
                "conduct Market and Licensee research\n" +
                "\n" +
                "Interact with external counsel and external experts\n" +
                "\n" +
                "Present and explain financial modelling in internal and external contexts\n" +
                "\n" +
                " \n" +
                "\n" +
                "To be successful in this role, you must have:\n" +
                "\n" +
                "Master Degree in Economics, Business Administration, Accounting or equivalent\n" +
                "\n" +
                "At least 5 years of experience performing financial analysis\n" +
                "\n" +
                "Strong financial modelling and excel skills\n" +
                "\n" +
                "Analytical skills and financial acumen\n" +
                "\n" +
                "Good understanding of economic principles, accounting, statistics, and financial reporting\n" +
                "\n" +
                "Attention to detail, structured ways of working and documentation, principled rigorous and fact-based analysis\n" +
                "\n" +
                "Composed and stress hardy personality with the ability to explain and present financial analysis accurately and orderly.";

        String vodafoneDetail = "Join our journey as we connect for a better future. Ready?\n" +
                "We are looking for a 'Software Engineer'\n" +
                "\n" +
                "#Vodafonespirit\n" +
                "\n" +
                "Our purpose at Vodafone is to connect for a better future. As a Global Communications Technology company, we put the customer at the heart of everything we do. We are forever challenging, pushing boundaries and discovering innovative ways to connect our customers with their digital societies.\n" +
                "\n" +
                "We connect people, businesses, and communities across the globe to create the future. We earn customer loyalty, experiment, learn fast and get it done, together. As you can imagine, this means that we have a vibrant and diverse mix of skills and people making Vodafone a great place to work.\n" +
                "\n" +
                "ROLE PURPOSE\n" +
                "\n" +
                "Design, develop and maintain VF ecommerce applications to enhance the functionality of products and services, compliant with business requirements and quality objectives Participates to whole software development lifecycle. Has in depth knowledge of specific areas and extensive knowledge of software development and provides insight to senior members of the team.\n" +
                "Communicates with cross-functional teams involved in whole software development lifecycle. Task management of project teams. Supervise solution/implementation of other developers\n" +
                "Responsible from technical architecture & full stack development of VF ecommerce platform application.\n" +
                "\n" +
                "Your place in the team\n" +
                "\n" +
                "Responsible for Analysis and validation of requirements for the assigned projects and clarifying business requirements.\n" +
                "Accountable for delivering detailed designs of the product and services.\n" +
                "Provide immediate solutions to problems by himself/herself or suggesting interim solution if it requires detailed examination.\n" +
                "Follow up testing phase of the product to ensure that software release is completed correctly on time.\n" +
                "Responsible for coding, debugging and testing complex software modules and cases (drawing simple flow chart, designing database model, designing modules, architecture).\n" +
                "Responsible for reviewing design and source code. If necessary, perform re-factoring software modules.\n" +
                "Document detailed system design specification and other technical documents (Writing release notes, subsystem specification & TLD documents )\n" +
                "Responsible for performing application monitoring and performance tuning of released product and services.\n" +
                "Do the troubleshooting, maintenance and 3rd level support of the products and services delivered to customers, as long as required. (Analyzing and fixing problems reported by customers.)\n" +
                "Drives system integration activities, closely works with related operation teams.\n" +
                "Providing technical advice to other organizations, partner, customer and stakeholders.\n" +
                "Support and troubleshoot applications as required, optimizing performance, resolving production problems, and providing timely status updates.\n" +
                "Provide support for the realization of Digital targets with Ecommerce project\n" +
                "Basic understanding of procedures and concepts within own domain\n" +
                "\n" +
                "We are looking for you if you have\n" +
                "\n" +
                "University degree in Computer Science, Computer Engineering or in a related discipline\n" +
                "Min 4 years expertise on software development technologies, design and architectures.\n" +
                "Ability to work in a fast-paced, dynamic environment and work on multiple projects simultaneously\n" +
                "Excellent problem-solving skills.\n" +
                "Strong communication skills.\n" +
                "Experience on Microservice development\n" +
                "Knowledge / Experience in Openshift, Docker, Oracle, PL/SQL, CICD\n" +
                "Knowledge / Experience in Tomcat/ Weblogic,\n" +
                "Expertise on some of the following technologies: Multithreading, concurrency, Junit, Spring Boot, RESTful APIs, Camunda, Web Services, PL-SQL, UML, Application Modelling Tools, GWT, GXT, HTML, HTTP , Modelling Tools, Maven, JPA/Hibernate, Git, Maven , Angular, JSF, Node.js, React,\n" +
                "Significant experience with object oriented programming methodology(Java or C/C++ programming languages) and Design patterns\n" +
                "Significant experience with MySQL/Oracle/LDAP database\n" +
                "Significant experience with Relational Databases, NoSQL databases\n" +
                "Be a good team player & be flexible in aligning personal goals with team objectives\n" +
                "Have strong communicational and interpersonal skills\n" +
                "Be passionate, curious & eager to learn,\n" +
                "Adapt to changing circumstances and demands, whilst maintaining standards\n" +
                "Have the ability to analyze, monitor and improve stability & performance of Java Applications\n" +
                "Good command of spoken and written English,\n" +
                "Strong understanding of software development process\n" +
                "Strong problem solving and analytic skills\n" +
                "Strong technical background and design experience\n" +
                "Excellent negotiation and communication skills\n" +
                "Strong presentation skills\n" +
                "Ability to work under pressure and tight deadlines\n" +
                "Preferably experienced in telecommunication sector";

        String turkcellApplyLink = "https://kariyer.turkcell.com.tr/S/JobSearch";
        String turkcellLearnLink = "https://www.udemy.com/topic/c-plus-plus/";

        String microsoftApplyLink = "https://careers.microsoft.com/us/en";
        String microsoftLearnLink = "https://www.coursera.org/browse/business/marketing";

        String peakApplyLink = "https://peak.com/open-positions/software-engineer-mobile-games";
        String peakLearnLink = "https://youtu.be/mvizlRaypH8";

        String unileverApplyLink = "https://careers.unilever.com/nl/en/internships";
        String unileverLearnLink = "https://www.unilever.com/about/take-action/action/learn/";

        String EriccsonApplyLink = "https://jobs.ericsson.com/search/business-analyst-.html?q=business-analyst-&sortColumn=sort_location&sortDirection=desc";
        String EriccsonLearnLink = "https://www.coursera.org/specializations/business-analytics";

        String vodafoneApplyLink = "https://careers.vodafone.com/job/Istanbul-Software-Engineer/620294801/";
        String vodafoneLearnLink = "https://youtu.be/Bj91CYVtWr8";

        JobItem item1 = new JobItem(0,"Junior C++ Developer","Turkcell","Istanbul, Turkey",R.drawable.turkcell,turkcellDetail,turkcellApplyLink,turkcellLearnLink);
        JobItem item2 = new JobItem(1,"Product Marketing Manager","Microsoft","Washington, USA",R.drawable.microsoft,microsoftDetail,microsoftApplyLink,microsoftLearnLink);
        JobItem item3 = new JobItem(2,"Game Developer","Peak","Remote",R.drawable.peak,peakDetail,peakApplyLink,peakLearnLink);
        JobItem item4 = new JobItem(3,"HR Intern","Unilever UK","London, UK",R.drawable.unilever,unileverDetail,unileverApplyLink,unileverLearnLink);
        JobItem item5 = new JobItem(4,"Business Analyst","Ericcson","Istanbul, Turkey",R.drawable.ericsson_logo_05,ericsondetail,EriccsonApplyLink,EriccsonLearnLink);
        JobItem item6 = new JobItem(5,"Software Engineer","Vodafone","Istanbul, Turkey",R.drawable.vodafone,vodafoneDetail,vodafoneApplyLink,vodafoneLearnLink);

        List<JobItem> data = new ArrayList<>();
        data.add(item1);
        data.add(item2);
        data.add(item3);
        data.add(item4);
        data.add(item5);
        data.add(item6);
        return data;
    }
}
