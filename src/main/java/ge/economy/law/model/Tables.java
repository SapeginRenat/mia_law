/**
 * This class is generated by jOOQ
 */
package ge.economy.law.model;


import ge.economy.law.model.tables.*;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.7.3"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Tables {

    /**
     * კოლეგია
     */
    public static final Board BOARD = ge.economy.law.model.tables.Board.BOARD;

    /**
     * The table public.case
     */
    public static final Case CASE = ge.economy.law.model.tables.Case.CASE;

    /**
     * The table public.case_doc
     */
    public static final CaseDoc CASE_DOC = ge.economy.law.model.tables.CaseDoc.CASE_DOC;

    /**
     * The table public.court
     */
    public static final Court COURT = ge.economy.law.model.tables.Court.COURT;

    /**
     * The table public.court_instance
     */
    public static final CourtInstance COURT_INSTANCE = ge.economy.law.model.tables.CourtInstance.COURT_INSTANCE;

    /**
     * The table public.end_result
     */
    public static final EndResult END_RESULT = ge.economy.law.model.tables.EndResult.END_RESULT;

    /**
     * The table public.judge
     */
    public static final Judge JUDGE = ge.economy.law.model.tables.Judge.JUDGE;

    /**
     * The table public.litigation_subject
     */
    public static final LitigationSubject LITIGATION_SUBJECT = ge.economy.law.model.tables.LitigationSubject.LITIGATION_SUBJECT;

    /**
     * The table public.status
     */
    public static final Status STATUS = ge.economy.law.model.tables.Status.STATUS;

    /**
     * The table public.user
     */
    public static final User USER = ge.economy.law.model.tables.User.USER;

    /**
     * The table public.user_status
     */
    public static final UserStatus USER_STATUS = ge.economy.law.model.tables.UserStatus.USER_STATUS;

    /**
     * The table public.user_type
     */
    public static final UserType USER_TYPE = ge.economy.law.model.tables.UserType.USER_TYPE;
}
