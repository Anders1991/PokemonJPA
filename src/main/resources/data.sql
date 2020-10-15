INSERT INTO Type(type, description) VALUES
('Normal','These are normal pokemon'),
('Water','These pokemon like to swim'),
('Electric','These pokemon installs your hardware'),
('Rock','These pokemon like to party'),
('Poison','These pokemon are sneaky. Do not trust them');

INSERT INTO Pokemon(name, description, number, TYPE_ID) VALUES
('Magikarp','Its a fish','129',2),
('Pikachu','Its a rodent','25',3),
('Geodude','Its a rock','74',4),
('Ekans','Its a snake','23',5);

INSERT INTO Team(name) VALUES
('SLAM JAM');

INSERT INTO Pokemon_Teams(POKEMONS_ID, TEAMS_ID) VALUES (1,1), (2,1);