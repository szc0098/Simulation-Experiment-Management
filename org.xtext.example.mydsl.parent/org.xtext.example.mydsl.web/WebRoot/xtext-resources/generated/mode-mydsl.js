define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "ANALOGOUS|BINARY|CHANGED|COMPOSITE|CONSTANT|CONTINOUS|CONTRADICT|COS|DATA|DECREASED|DISCRETE|EXP|EXPLAIN|FACTORIAL|FALSE|FRACTIONALFACTORIAL|FULLFACTORIAL|HIGH|INCREASED|INVERSE|LOG|LOW|MAX|MEDIUM|MIN|NONBINARY|OTHERS|QUALITATIVE|QUANTITATIVE|SIMPLE|SIN|TAN|TRUE|absent|activation|added|after|always|and|are|at|before|between|coherence|compare|constraints|context|control|dependent|design|designType|event|eventually|evidence|exists|experiment|focus|for|goal|hypotheses|if|in|independent|is|iterations|leads|level|levels|mechanism|mechanistic|model|never|not|number|object|occurs|of|or|parameter|precedes|properties|purpose|relational|removed|study|then|to|type|until|values|variables|weight|where|with";
		this.$rules = {
			"start": [
				{token: "comment", regex: "\\/\\/.*$"},
				{token: "comment", regex: "\\/\\*", next : "comment"},
				{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
				{token: "string", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"},
				{token: "constant.numeric", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
				{token: "lparen", regex: "[\\[({]"},
				{token: "rparen", regex: "[\\])}]"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			],
			"comment": [
				{token: "comment", regex: ".*?\\*\\/", next : "start"},
				{token: "comment", regex: ".+"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/mydsl";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});
