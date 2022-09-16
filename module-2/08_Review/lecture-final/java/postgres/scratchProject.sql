
select
    UserId
    ,Username
    ,Userrole
    ,UserPasswordHash
    ,UserPasswordSalt
    ,PasswordAlgorithm
    ,IsForcePasswordChange
    ,IsForceUserChange
    ,CreateDate
    ,LanguageCode
    ,DenyAccess
    from
        AppUser;

-- update AppUser set userpasswordhash='YmJH+WL8utqsvx2q6aBHZg=='