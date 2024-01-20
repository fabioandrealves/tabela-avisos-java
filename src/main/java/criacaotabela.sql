CREATE TABLE IF NOT EXISTS `aviso` (
`codigo` int(11) NOT NULL,
  `autor` varchar(50) NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `texto` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

ALTER TABLE `aviso` ADD PRIMARY KEY (`codigo`);
--
-- Extraindo dados da tabela `aviso`
--

INSERT INTO `aviso` (`codigo`, `autor`, `titulo`, `texto`) VALUES
(1, 'Mario', 'cuidado', 'Cuidado ao responder as questões'),
(2, 'Maria', 'Atenção', 'Responda com atenção');

ALTER TABLE `aviso`
MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
