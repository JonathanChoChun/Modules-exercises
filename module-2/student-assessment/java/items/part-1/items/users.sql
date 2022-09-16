set datestyle to ISO,MDY;
create table users (
	id serial PRIMARY KEY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	email VARCHAR(50),
	role VARCHAR(7),
	created DATE
);
insert into users (id, first_name, last_name, email, role, created) values (1, 'Gradey', 'Kubu', 'gkubu0@un.org', 'manager', '5/14/2019');
insert into users (id, first_name, last_name, email, role, created) values (2, 'Kristel', 'Brereton', null, 'user', '12/23/2018');
insert into users (id, first_name, last_name, email, role, created) values (3, 'Juliet', 'Hatherleigh', 'jhatherleigh2@weibo.com', 'user', '7/31/2019');
insert into users (id, first_name, last_name, email, role, created) values (4, 'Nap', 'Lauthian', 'nlauthian3@wordpress.com', 'admin', '3/3/2019');
insert into users (id, first_name, last_name, email, role, created) values (5, 'Siegfried', 'Trenoweth', 'strenoweth4@cbsnews.com', 'user', '5/14/2019');
insert into users (id, first_name, last_name, email, role, created) values (6, 'Casper', 'Arlet', 'carlet5@si.edu', 'user', '11/4/2018');
insert into users (id, first_name, last_name, email, role, created) values (7, 'Gretta', 'MacInherney', 'gmacinherney6@cafepress.com', 'admin', '7/14/2019');
insert into users (id, first_name, last_name, email, role, created) values (8, 'Isidore', 'Anespie', 'ianespie7@taobao.com', 'user', '8/13/2019');
insert into users (id, first_name, last_name, email, role, created) values (9, 'Latia', 'Benbow', 'lbenbow8@illinois.edu', 'user', '4/21/2019');
insert into users (id, first_name, last_name, email, role, created) values (10, 'Panchito', 'Blanning', 'pblanning9@spiegel.de', 'manager', '4/1/2019');
insert into users (id, first_name, last_name, email, role, created) values (11, 'Daryn', 'Yerbury', 'dyerburya@vkontakte.ru', 'user', '2/28/2019');
insert into users (id, first_name, last_name, email, role, created) values (12, 'Sigvard', 'Murtagh', 'smurtaghb@businessinsider.com', 'user', '8/26/2019');
insert into users (id, first_name, last_name, email, role, created) values (13, 'Dorris', 'Siviter', 'dsiviterc@yelp.com', 'user', '8/12/2019');
insert into users (id, first_name, last_name, email, role, created) values (14, 'Cassie', 'Konmann', 'ckonmannd@cisco.com', 'admin', '7/11/2019');
insert into users (id, first_name, last_name, email, role, created) values (15, 'Adolpho', 'Ramsted', 'aramstede@pen.io', 'user', '2/12/2019');
insert into users (id, first_name, last_name, email, role, created) values (16, 'Jules', 'Inder', 'jinderf@tripadvisor.com', 'manager', '8/30/2019');
insert into users (id, first_name, last_name, email, role, created) values (17, 'Bayard', 'Mattiussi', 'bmattiussig@vimeo.com', 'manager', '12/15/2018');
insert into users (id, first_name, last_name, email, role, created) values (18, 'Mace', 'Downing', 'mdowningh@arstechnica.com', 'manager', '3/27/2019');
insert into users (id, first_name, last_name, email, role, created) values (19, 'Mallorie', 'Darwen', 'mdarweni@walmart.com', 'user', '8/24/2019');
insert into users (id, first_name, last_name, email, role, created) values (20, 'Darrelle', 'Isaksson', 'disakssonj@opera.com', 'manager', '10/31/2018');
insert into users (id, first_name, last_name, email, role, created) values (21, 'Clarke', 'Jiracek', 'cjiracekk@twitter.com', 'admin', '7/25/2019');
insert into users (id, first_name, last_name, email, role, created) values (22, 'Rolfe', 'Doogood', 'rdoogoodl@flickr.com', 'user', '4/11/2019');
insert into users (id, first_name, last_name, email, role, created) values (23, 'Alida', 'Dalman', 'adalmanm@example.com', 'admin', '9/10/2019');
insert into users (id, first_name, last_name, email, role, created) values (24, 'Oneida', 'Hillin', 'ohillinn@guardian.co.uk', 'admin', '9/25/2019');
insert into users (id, first_name, last_name, email, role, created) values (25, 'Dicky', 'Monelli', null, 'user', '2/22/2019');
insert into users (id, first_name, last_name, email, role, created) values (26, 'Arlana', 'Clegg', 'acleggp@mayoclinic.com', 'admin', '6/6/2019');
insert into users (id, first_name, last_name, email, role, created) values (27, 'Abbey', 'Larrett', 'alarrettq@360.cn', 'user', '8/19/2019');
insert into users (id, first_name, last_name, email, role, created) values (28, 'Hamlen', 'Tarbert', 'htarbertr@ca.gov', 'manager', '9/5/2019');
insert into users (id, first_name, last_name, email, role, created) values (29, 'Delinda', 'Harmar', 'dharmars@google.fr', 'admin', '6/4/2019');
insert into users (id, first_name, last_name, email, role, created) values (30, 'Brooks', 'Roizn', 'broiznt@sciencedirect.com', 'admin', '10/2/2019');
insert into users (id, first_name, last_name, email, role, created) values (31, 'Keenan', 'Albiston', 'kalbistonu@bigcartel.com', 'user', '11/20/2018');
insert into users (id, first_name, last_name, email, role, created) values (32, 'Jacinda', 'Codron', 'jcodronv@oracle.com', 'admin', '2/19/2019');
insert into users (id, first_name, last_name, email, role, created) values (33, 'Jemima', 'Skaid', 'jskaidw@networkadvertising.org', 'user', '12/19/2018');
insert into users (id, first_name, last_name, email, role, created) values (34, 'Saleem', 'Brosel', 'sbroselx@mozilla.org', 'manager', '4/17/2019');
insert into users (id, first_name, last_name, email, role, created) values (35, 'Simona', 'Coultas', 'scoultasy@economist.com', 'manager', '4/27/2019');
insert into users (id, first_name, last_name, email, role, created) values (36, 'Henri', 'Olekhov', 'holekhovz@godaddy.com', 'manager', '12/20/2018');
insert into users (id, first_name, last_name, email, role, created) values (37, 'Cully', 'Diamant', null, 'user', '2/2/2019');
insert into users (id, first_name, last_name, email, role, created) values (38, 'Michal', 'Earlam', 'mearlam11@myspace.com', 'user', '1/11/2019');
insert into users (id, first_name, last_name, email, role, created) values (39, 'Marcelline', 'Zanassi', 'mzanassi12@jigsy.com', 'admin', '9/13/2019');
insert into users (id, first_name, last_name, email, role, created) values (40, 'Bili', 'Kunneke', 'bkunneke13@4shared.com', 'manager', '2/24/2019');
insert into users (id, first_name, last_name, email, role, created) values (41, 'Heddi', 'Pedroni', 'hpedroni14@comcast.net', 'user', '4/30/2019');
insert into users (id, first_name, last_name, email, role, created) values (42, 'Sibel', 'Whimper', null, 'user', '9/21/2019');
insert into users (id, first_name, last_name, email, role, created) values (43, 'Rosalie', 'Barkshire', 'rbarkshire16@msn.com', 'user', '5/25/2019');
insert into users (id, first_name, last_name, email, role, created) values (44, 'Worth', 'Riddich', 'wriddich17@hc360.com', 'admin', '12/8/2018');
insert into users (id, first_name, last_name, email, role, created) values (45, 'Bart', 'Gregol', 'bgregol18@devhub.com', 'user', '7/23/2019');
insert into users (id, first_name, last_name, email, role, created) values (46, 'Aldo', 'Hullah', 'ahullah19@tiny.cc', 'admin', '1/1/2019');
insert into users (id, first_name, last_name, email, role, created) values (47, 'Lavinia', 'Orred', 'lorred1a@independent.co.uk', 'manager', '10/24/2018');
insert into users (id, first_name, last_name, email, role, created) values (48, 'Javier', 'Zellner', 'jzellner1b@issuu.com', 'user', '1/18/2019');
insert into users (id, first_name, last_name, email, role, created) values (49, 'Jephthah', 'Marler', 'jmarler1c@twitpic.com', 'user', '5/18/2019');
insert into users (id, first_name, last_name, email, role, created) values (50, 'Angelia', 'Wolverson', 'awolverson1d@mayoclinic.com', 'admin', '8/26/2019');
insert into users (id, first_name, last_name, email, role, created) values (51, 'Goldina', 'McGeneay', 'gmcgeneay1e@engadget.com', 'manager', '1/11/2019');
insert into users (id, first_name, last_name, email, role, created) values (52, 'Kelcey', 'Stump', 'kstump1f@nhs.uk', 'manager', '4/4/2019');
insert into users (id, first_name, last_name, email, role, created) values (53, 'Bernardo', 'Seaborn', 'bseaborn1g@sciencedirect.com', 'manager', '12/20/2018');
insert into users (id, first_name, last_name, email, role, created) values (54, 'Arly', 'Kiwitz', 'akiwitz1h@latimes.com', 'manager', '1/14/2019');
insert into users (id, first_name, last_name, email, role, created) values (55, 'Cordie', 'Ghidelli', 'cghidelli1i@sphinn.com', 'admin', '1/2/2019');
insert into users (id, first_name, last_name, email, role, created) values (56, 'Monty', 'Oblein', 'moblein1j@nba.com', 'manager', '3/12/2019');
insert into users (id, first_name, last_name, email, role, created) values (57, 'Eunice', 'Gleadhell', 'egleadhell1k@lycos.com', 'user', '7/15/2019');
insert into users (id, first_name, last_name, email, role, created) values (58, 'Rhodia', 'Pattenden', 'rpattenden1l@rambler.ru', 'admin', '7/23/2019');
insert into users (id, first_name, last_name, email, role, created) values (59, 'Herc', 'Gilbertson', 'hgilbertson1m@behance.net', 'manager', '6/19/2019');
insert into users (id, first_name, last_name, email, role, created) values (60, 'Artemus', 'Galvan', null, 'admin', '11/9/2018');
insert into users (id, first_name, last_name, email, role, created) values (61, 'Tannie', 'Woodburne', 'twoodburne1o@globo.com', 'manager', '4/10/2019');
insert into users (id, first_name, last_name, email, role, created) values (62, 'Thekla', 'Dumberell', 'tdumberell1p@mtv.com', 'user', '1/22/2019');
insert into users (id, first_name, last_name, email, role, created) values (63, 'Zolly', 'Hatcliffe', 'zhatcliffe1q@smh.com.au', 'manager', '7/9/2019');
insert into users (id, first_name, last_name, email, role, created) values (64, 'Letta', 'Giraudeau', 'lgiraudeau1r@hatena.ne.jp', 'user', '2/20/2019');
insert into users (id, first_name, last_name, email, role, created) values (65, 'Heinrick', 'O''Caherny', 'hocaherny1s@1und1.de', 'manager', '9/17/2019');
insert into users (id, first_name, last_name, email, role, created) values (66, 'Raffaello', 'Noore', 'rnoore1t@imageshack.us', 'user', '7/20/2019');
insert into users (id, first_name, last_name, email, role, created) values (67, 'Sibyl', 'Kleinlerer', 'skleinlerer1u@tripod.com', 'admin', '5/4/2019');
insert into users (id, first_name, last_name, email, role, created) values (68, 'Vivianne', 'Bullene', 'vbullene1v@kickstarter.com', 'admin', '12/20/2018');
insert into users (id, first_name, last_name, email, role, created) values (69, 'Vanni', 'Crowth', null, 'manager', '11/20/2018');
insert into users (id, first_name, last_name, email, role, created) values (70, 'Shirlee', 'Riguard', 'sriguard1x@typepad.com', 'manager', '7/1/2019');
insert into users (id, first_name, last_name, email, role, created) values (71, 'Anthony', 'Milroy', 'amilroy1y@ask.com', 'manager', '1/25/2019');
insert into users (id, first_name, last_name, email, role, created) values (72, 'Odelle', 'Matveiko', 'omatveiko1z@house.gov', 'manager', '8/23/2019');
insert into users (id, first_name, last_name, email, role, created) values (73, 'Woody', 'Clinton', 'wclinton20@constantcontact.com', 'manager', '10/28/2018');
insert into users (id, first_name, last_name, email, role, created) values (74, 'Grady', 'Dargue', null, 'admin', '6/6/2019');
insert into users (id, first_name, last_name, email, role, created) values (75, 'Ilsa', 'Leeson', 'ileeson22@huffingtonpost.com', 'user', '12/27/2018');
insert into users (id, first_name, last_name, email, role, created) values (76, 'Kassie', 'Coil', 'kcoil23@apple.com', 'admin', '7/24/2019');
insert into users (id, first_name, last_name, email, role, created) values (77, 'Reggi', 'Featherby', 'rfeatherby24@vk.com', 'admin', '5/27/2019');
insert into users (id, first_name, last_name, email, role, created) values (78, 'Matthieu', 'McGlaughn', 'mmcglaughn25@ifeng.com', 'admin', '7/22/2019');
insert into users (id, first_name, last_name, email, role, created) values (79, 'Dannie', 'Borsay', 'dborsay26@istockphoto.com', 'manager', '11/11/2018');
insert into users (id, first_name, last_name, email, role, created) values (80, 'Zulema', 'Guntrip', 'zguntrip27@addthis.com', 'admin', '3/29/2019');
insert into users (id, first_name, last_name, email, role, created) values (81, 'Cecilla', 'Ciccotto', 'cciccotto28@cnbc.com', 'admin', '10/7/2019');
insert into users (id, first_name, last_name, email, role, created) values (82, 'Obed', 'Spaule', null, 'user', '9/29/2019');
insert into users (id, first_name, last_name, email, role, created) values (83, 'Renate', 'Baton', 'rbaton2a@naver.com', 'admin', '11/25/2018');
insert into users (id, first_name, last_name, email, role, created) values (84, 'Emelita', 'Worsfield', null, 'admin', '4/29/2019');
insert into users (id, first_name, last_name, email, role, created) values (85, 'Brigid', 'Farrent', 'bfarrent2c@indiatimes.com', 'manager', '3/9/2019');
insert into users (id, first_name, last_name, email, role, created) values (86, 'Dulcea', 'Coath', 'dcoath2d@cafepress.com', 'admin', '1/1/2019');
insert into users (id, first_name, last_name, email, role, created) values (87, 'Rubetta', 'Arnke', 'rarnke2e@europa.eu', 'user', '10/7/2019');
insert into users (id, first_name, last_name, email, role, created) values (88, 'Goldarina', 'Dietsche', 'gdietsche2f@fastcompany.com', 'user', '8/2/2019');
insert into users (id, first_name, last_name, email, role, created) values (89, 'Doug', 'Manning', null, 'manager', '3/25/2019');
insert into users (id, first_name, last_name, email, role, created) values (90, 'Nerissa', 'Fraanchyonok', 'nfraanchyonok2h@redcross.org', 'user', '5/18/2019');
insert into users (id, first_name, last_name, email, role, created) values (91, 'Jorey', 'Keward', 'jkeward2i@whitehouse.gov', 'user', '2/26/2019');
insert into users (id, first_name, last_name, email, role, created) values (92, 'Billie', 'Trotman', 'btrotman2j@reference.com', 'user', '1/5/2019');
insert into users (id, first_name, last_name, email, role, created) values (93, 'Forest', 'Daniau', 'fdaniau2k@icio.us', 'user', '8/2/2019');
insert into users (id, first_name, last_name, email, role, created) values (94, 'Tatiania', 'Bartalucci', null, 'admin', '7/2/2019');
insert into users (id, first_name, last_name, email, role, created) values (95, 'Edeline', 'Warcup', 'ewarcup2m@tinypic.com', 'admin', '9/29/2019');
insert into users (id, first_name, last_name, email, role, created) values (96, 'Sal', 'Gilhoolie', 'sgilhoolie2n@wisc.edu', 'user', '12/23/2018');
insert into users (id, first_name, last_name, email, role, created) values (97, 'Fons', 'Flowith', 'fflowith2o@delicious.com', 'admin', '9/3/2019');
insert into users (id, first_name, last_name, email, role, created) values (98, 'Court', 'Dashper', 'cdashper2p@nba.com', 'admin', '8/2/2019');
insert into users (id, first_name, last_name, email, role, created) values (99, 'Ward', 'Forsdike', null, 'manager', '3/31/2019');
insert into users (id, first_name, last_name, email, role, created) values (100, 'Drew', 'O''Hegertie', 'dohegertie2r@wordpress.com', 'manager', '6/28/2019');
insert into users (id, first_name, last_name, email, role, created) values (101, 'Frazer', 'Heams', null, 'admin', '4/18/2019');
insert into users (id, first_name, last_name, email, role, created) values (102, 'Henrietta', 'Southcombe', 'hsouthcombe2t@ca.gov', 'manager', '11/9/2018');
insert into users (id, first_name, last_name, email, role, created) values (103, 'Sherwood', 'Nawton', 'snawton2u@a8.net', 'manager', '7/14/2019');
insert into users (id, first_name, last_name, email, role, created) values (104, 'Clifford', 'Sneller', 'csneller2v@spiegel.de', 'user', '9/24/2019');
insert into users (id, first_name, last_name, email, role, created) values (105, 'Ashely', 'Scrange', 'ascrange2w@webmd.com', 'user', '2/12/2019');
insert into users (id, first_name, last_name, email, role, created) values (106, 'Eugenie', 'Beeze', 'ebeeze2x@marketwatch.com', 'manager', '2/5/2019');
insert into users (id, first_name, last_name, email, role, created) values (107, 'Rab', 'Winton', 'rwinton2y@vimeo.com', 'manager', '12/22/2018');
insert into users (id, first_name, last_name, email, role, created) values (108, 'Prudi', 'Gotobed', 'pgotobed2z@networkadvertising.org', 'manager', '5/29/2019');
insert into users (id, first_name, last_name, email, role, created) values (109, 'Lyle', 'Heister', 'lheister30@blog.com', 'admin', '8/27/2019');
insert into users (id, first_name, last_name, email, role, created) values (110, 'Kassi', 'Gorcke', 'kgorcke31@geocities.jp', 'user', '8/9/2019');
insert into users (id, first_name, last_name, email, role, created) values (111, 'Shirl', 'Kivlin', 'skivlin32@123-reg.co.uk', 'admin', '3/19/2019');
insert into users (id, first_name, last_name, email, role, created) values (112, 'Waiter', 'Dyke', 'wdyke33@mashable.com', 'user', '7/8/2019');
insert into users (id, first_name, last_name, email, role, created) values (113, 'Lillian', 'Brim', 'lbrim34@printfriendly.com', 'manager', '5/20/2019');
insert into users (id, first_name, last_name, email, role, created) values (114, 'Maurice', 'Bagge', 'mbagge35@google.de', 'admin', '3/12/2019');
insert into users (id, first_name, last_name, email, role, created) values (115, 'Perrine', 'Robathon', 'probathon36@senate.gov', 'user', '2/2/2019');
insert into users (id, first_name, last_name, email, role, created) values (116, 'Gray', 'Arr', 'garr37@networkadvertising.org', 'admin', '6/12/2019');
insert into users (id, first_name, last_name, email, role, created) values (117, 'Angel', 'Groll', 'agroll38@elpais.com', 'manager', '1/6/2019');
insert into users (id, first_name, last_name, email, role, created) values (118, 'Christiano', 'Antcliff', 'cantcliff39@linkedin.com', 'admin', '3/16/2019');
insert into users (id, first_name, last_name, email, role, created) values (119, 'Shina', 'Roskelly', 'sroskelly3a@freewebs.com', 'admin', '9/19/2019');
insert into users (id, first_name, last_name, email, role, created) values (120, 'Irena', 'Noddle', 'inoddle3b@google.co.uk', 'manager', '2/9/2019');
insert into users (id, first_name, last_name, email, role, created) values (121, 'Zorah', 'Lambell', null, 'user', '11/24/2018');
insert into users (id, first_name, last_name, email, role, created) values (122, 'Drusy', 'Poter', 'dpoter3d@ftc.gov', 'user', '6/14/2019');
insert into users (id, first_name, last_name, email, role, created) values (123, 'Ezechiel', 'Tabbernor', 'etabbernor3e@t-online.de', 'manager', '8/23/2019');
insert into users (id, first_name, last_name, email, role, created) values (124, 'Cordula', 'Wilbud', 'cwilbud3f@dot.gov', 'user', '5/3/2019');
insert into users (id, first_name, last_name, email, role, created) values (125, 'Sharai', 'Elt', 'selt3g@pen.io', 'manager', '7/15/2019');
insert into users (id, first_name, last_name, email, role, created) values (126, 'Preston', 'Ruter', null, 'manager', '11/18/2018');
insert into users (id, first_name, last_name, email, role, created) values (127, 'Lianne', 'Dellar', 'ldellar3i@is.gd', 'user', '2/21/2019');
insert into users (id, first_name, last_name, email, role, created) values (128, 'Calhoun', 'Nowlan', 'cnowlan3j@amazon.com', 'admin', '1/13/2019');
insert into users (id, first_name, last_name, email, role, created) values (129, 'Frans', 'Matanin', 'fmatanin3k@state.gov', 'manager', '5/18/2019');
insert into users (id, first_name, last_name, email, role, created) values (130, 'Katti', 'Glauber', 'kglauber3l@aol.com', 'user', '4/12/2019');
insert into users (id, first_name, last_name, email, role, created) values (131, 'Winonah', 'Laverty', 'wlaverty3m@hexun.com', 'user', '8/19/2019');
insert into users (id, first_name, last_name, email, role, created) values (132, 'Gabrielle', 'Soffe', 'gsoffe3n@squidoo.com', 'user', '12/2/2018');
insert into users (id, first_name, last_name, email, role, created) values (133, 'Ric', 'Beacon', null, 'manager', '2/11/2019');
insert into users (id, first_name, last_name, email, role, created) values (134, 'Eddy', 'Spira', 'espira3p@theatlantic.com', 'manager', '11/11/2018');
insert into users (id, first_name, last_name, email, role, created) values (135, 'Nicoli', 'Wray', 'nwray3q@istockphoto.com', 'admin', '8/9/2019');
insert into users (id, first_name, last_name, email, role, created) values (136, 'Vivia', 'Osmon', 'vosmon3r@ftc.gov', 'admin', '8/7/2019');
insert into users (id, first_name, last_name, email, role, created) values (137, 'Rhianna', 'Plunket', 'rplunket3s@soundcloud.com', 'admin', '6/2/2019');
insert into users (id, first_name, last_name, email, role, created) values (138, 'Neal', 'Playford', 'nplayford3t@cyberchimps.com', 'admin', '7/20/2019');
insert into users (id, first_name, last_name, email, role, created) values (139, 'Kissie', 'Stickford', 'kstickford3u@cafepress.com', 'manager', '1/9/2019');
insert into users (id, first_name, last_name, email, role, created) values (140, 'Edie', 'Danielkiewicz', 'edanielkiewicz3v@sphinn.com', 'manager', '8/25/2019');
insert into users (id, first_name, last_name, email, role, created) values (141, 'Aubree', 'Fasler', 'afasler3w@harvard.edu', 'admin', '3/21/2019');
insert into users (id, first_name, last_name, email, role, created) values (142, 'Marc', 'Lanaway', 'mlanaway3x@oracle.com', 'user', '11/7/2018');
insert into users (id, first_name, last_name, email, role, created) values (143, 'Kassie', 'Sheeran', 'ksheeran3y@psu.edu', 'manager', '2/2/2019');
insert into users (id, first_name, last_name, email, role, created) values (144, 'Cecil', 'Luparti', 'cluparti3z@weebly.com', 'manager', '1/11/2019');
insert into users (id, first_name, last_name, email, role, created) values (145, 'Sam', 'Sweetzer', 'ssweetzer40@utexas.edu', 'user', '3/15/2019');
insert into users (id, first_name, last_name, email, role, created) values (146, 'Sadella', 'Strode', 'sstrode41@goo.ne.jp', 'user', '2/14/2019');
insert into users (id, first_name, last_name, email, role, created) values (147, 'Meghann', 'Collymore', 'mcollymore42@posterous.com', 'user', '2/6/2019');
insert into users (id, first_name, last_name, email, role, created) values (148, 'Effie', 'Clubb', 'eclubb43@thetimes.co.uk', 'manager', '11/5/2018');
insert into users (id, first_name, last_name, email, role, created) values (149, 'Dalia', 'Hanrahan', 'dhanrahan44@home.pl', 'manager', '3/31/2019');
insert into users (id, first_name, last_name, email, role, created) values (150, 'Frederick', 'Tonner', 'ftonner45@diigo.com', 'manager', '12/25/2018');
insert into users (id, first_name, last_name, email, role, created) values (151, 'Inger', 'Faint', 'ifaint46@ox.ac.uk', 'admin', '7/31/2019');
insert into users (id, first_name, last_name, email, role, created) values (152, 'Brandise', 'Cruickshanks', 'bcruickshanks47@irs.gov', 'user', '5/21/2019');
insert into users (id, first_name, last_name, email, role, created) values (153, 'Sydney', 'Duesbury', 'sduesbury48@nymag.com', 'manager', '7/1/2019');
insert into users (id, first_name, last_name, email, role, created) values (154, 'Maurene', 'Crop', 'mcrop49@blogtalkradio.com', 'manager', '1/11/2019');
insert into users (id, first_name, last_name, email, role, created) values (155, 'Lucita', 'Diggins', 'ldiggins4a@phpbb.com', 'admin', '6/22/2019');
insert into users (id, first_name, last_name, email, role, created) values (156, 'Yolanda', 'Crippin', 'ycrippin4b@about.me', 'admin', '8/17/2019');
insert into users (id, first_name, last_name, email, role, created) values (157, 'Judith', 'Nobles', 'jnobles4c@sciencedirect.com', 'user', '1/25/2019');
insert into users (id, first_name, last_name, email, role, created) values (158, 'Hermie', 'Grigg', 'hgrigg4d@dmoz.org', 'user', '11/15/2018');
insert into users (id, first_name, last_name, email, role, created) values (159, 'Shurlock', 'Shoosmith', 'sshoosmith4e@marketwatch.com', 'admin', '7/22/2019');
insert into users (id, first_name, last_name, email, role, created) values (160, 'Fabio', 'Dreghorn', null, 'admin', '4/4/2019');
insert into users (id, first_name, last_name, email, role, created) values (161, 'Pennie', 'Macieja', null, 'user', '6/5/2019');
insert into users (id, first_name, last_name, email, role, created) values (162, 'Berrie', 'Methley', 'bmethley4h@gizmodo.com', 'user', '5/1/2019');
insert into users (id, first_name, last_name, email, role, created) values (163, 'Benny', 'Dingate', 'bdingate4i@amazon.co.jp', 'admin', '3/26/2019');
insert into users (id, first_name, last_name, email, role, created) values (164, 'Gennifer', 'Kurtis', 'gkurtis4j@privacy.gov.au', 'manager', '6/9/2019');
insert into users (id, first_name, last_name, email, role, created) values (165, 'Minda', 'Skittrell', null, 'manager', '8/8/2019');
insert into users (id, first_name, last_name, email, role, created) values (166, 'Colene', 'Karczinski', 'ckarczinski4l@twitpic.com', 'user', '11/22/2018');
insert into users (id, first_name, last_name, email, role, created) values (167, 'Bee', 'Betjeman', 'bbetjeman4m@gravatar.com', 'manager', '8/14/2019');
insert into users (id, first_name, last_name, email, role, created) values (168, 'Leoline', 'Lucus', 'llucus4n@intel.com', 'admin', '6/18/2019');
insert into users (id, first_name, last_name, email, role, created) values (169, 'Seana', 'Lapree', null, 'admin', '4/3/2019');
insert into users (id, first_name, last_name, email, role, created) values (170, 'Krystal', 'Pottle', 'kpottle4p@ihg.com', 'user', '3/29/2019');
insert into users (id, first_name, last_name, email, role, created) values (171, 'Ninnette', 'Edridge', 'nedridge4q@shutterfly.com', 'manager', '6/2/2019');
insert into users (id, first_name, last_name, email, role, created) values (172, 'Ingram', 'Whaymand', 'iwhaymand4r@washington.edu', 'admin', '12/9/2018');
insert into users (id, first_name, last_name, email, role, created) values (173, 'Teodorico', 'Lembcke', 'tlembcke4s@oakley.com', 'admin', '11/6/2018');
insert into users (id, first_name, last_name, email, role, created) values (174, 'Jerome', 'Pontefract', 'jpontefract4t@jalbum.net', 'manager', '3/15/2019');
insert into users (id, first_name, last_name, email, role, created) values (175, 'Devin', 'Jelfs', null, 'user', '12/16/2018');
insert into users (id, first_name, last_name, email, role, created) values (176, 'Quinn', 'Keddy', 'qkeddy4v@meetup.com', 'user', '2/27/2019');
insert into users (id, first_name, last_name, email, role, created) values (177, 'Dean', 'Soff', 'dsoff4w@mozilla.com', 'manager', '1/13/2019');
insert into users (id, first_name, last_name, email, role, created) values (178, 'Millisent', 'Filippucci', 'mfilippucci4x@home.pl', 'user', '7/9/2019');
insert into users (id, first_name, last_name, email, role, created) values (179, 'Nevins', 'Tetsall', 'ntetsall4y@usatoday.com', 'user', '2/4/2019');
insert into users (id, first_name, last_name, email, role, created) values (180, 'Caro', 'Ibbison', 'cibbison4z@wisc.edu', 'manager', '5/10/2019');
insert into users (id, first_name, last_name, email, role, created) values (181, 'Pebrook', 'Shorton', 'pshorton50@latimes.com', 'admin', '9/17/2019');
insert into users (id, first_name, last_name, email, role, created) values (182, 'Gerard', 'Skurray', 'gskurray51@nbcnews.com', 'user', '9/30/2019');
insert into users (id, first_name, last_name, email, role, created) values (183, 'Charissa', 'Bennen', 'cbennen52@theguardian.com', 'admin', '1/28/2019');
insert into users (id, first_name, last_name, email, role, created) values (184, 'Virgina', 'Grundey', 'vgrundey53@arizona.edu', 'admin', '12/10/2018');
insert into users (id, first_name, last_name, email, role, created) values (185, 'Nestor', 'Copello', 'ncopello54@people.com.cn', 'admin', '10/27/2018');
insert into users (id, first_name, last_name, email, role, created) values (186, 'Sari', 'Gherarducci', 'sgherarducci55@blogtalkradio.com', 'admin', '6/10/2019');
insert into users (id, first_name, last_name, email, role, created) values (187, 'Gareth', 'Tristram', 'gtristram56@house.gov', 'user', '7/28/2019');
insert into users (id, first_name, last_name, email, role, created) values (188, 'Cara', 'Dering', 'cdering57@wired.com', 'admin', '2/18/2019');
insert into users (id, first_name, last_name, email, role, created) values (189, 'Cassius', 'Casson', 'ccasson58@spotify.com', 'admin', '7/20/2019');
insert into users (id, first_name, last_name, email, role, created) values (190, 'Hilda', 'Mannock', null, 'user', '8/22/2019');
insert into users (id, first_name, last_name, email, role, created) values (191, 'Quintina', 'Gather', 'qgather5a@cloudflare.com', 'admin', '9/27/2019');
insert into users (id, first_name, last_name, email, role, created) values (192, 'Angelica', 'Macewan', 'amacewan5b@ucoz.ru', 'admin', '12/11/2018');
insert into users (id, first_name, last_name, email, role, created) values (193, 'Luella', 'Dodell', 'ldodell5c@ameblo.jp', 'user', '1/9/2019');
insert into users (id, first_name, last_name, email, role, created) values (194, 'Toni', 'Langlois', 'tlanglois5d@prnewswire.com', 'user', '1/2/2019');
insert into users (id, first_name, last_name, email, role, created) values (195, 'Claresta', 'Bosdet', 'cbosdet5e@unblog.fr', 'manager', '9/4/2019');
insert into users (id, first_name, last_name, email, role, created) values (196, 'Bobby', 'Gunter', 'bgunter5f@bandcamp.com', 'admin', '8/25/2019');
insert into users (id, first_name, last_name, email, role, created) values (197, 'Erna', 'Busch', 'ebusch5g@rakuten.co.jp', 'manager', '4/8/2019');
insert into users (id, first_name, last_name, email, role, created) values (198, 'Bambie', 'Mohring', 'bmohring5h@unesco.org', 'manager', '7/27/2019');
insert into users (id, first_name, last_name, email, role, created) values (199, 'Veronique', 'Semmence', 'vsemmence5i@theguardian.com', 'manager', '11/13/2018');
insert into users (id, first_name, last_name, email, role, created) values (200, 'Rosetta', 'Koschke', 'rkoschke5j@ovh.net', 'admin', '7/28/2019');
ALTER SEQUENCE users_id_seq RESTART WITH 201;